import java.util.PriorityQueue;

public class Median{
    private PriorityQueue<Integer> max;
    private PriorityQueue<Integer> min;

    public Median(){
	max = new PriorityQueue<Integer>(11, new MaxComp());
	min = new PriorityQueue<Integer>(11, new MinComp());	
    }

    public void add(int x){
	if (max.size() == 0 || x <= max.peek())
	    max.add(x);
	else
	    min.add(x);
	if(max.size() - min.size() > 1){
	    min.add(max.poll());
	}
	if(min.size() - max.size() > 0){
	    max.add(min.poll());
	}
    }
    
    public int findMedian(){
	if (max.size() == 0)
	    return Integer.MAX_VALUE;	
	if (max.size() > min.size())
	    return max.peek();
	else
	    return (max.peek() + min.peek()) /2;
    }
    
    public int removeMedian(){
	if (max.size() == 0)
	    return Integer.MAX_VALUE;
	else if (max.size() > min.size())
	    return max.poll();
	else
	    return (max.poll() + min.poll())/2;
    }
    

    public static void main(String[] args){
	int[] Joey = new int[11];
	for (int i = 0; i < 11; i++){
	    Joey[i] = (int)(Math.random()*300);
	    System.out.print(Joey[i]+" ");	    
	}
	System.out.println();
	
	Median asd = new Median();
	for( int a : Joey){
	    asd.add(a);
	}
	for( int i = 0; i < 10; i++)
	    System.out.println(asd.removeMedian());
    }
	
}


