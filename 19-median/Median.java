

public class Median{
    private PriorityQueue<Integer> max;
    private PriorityQueue<Integer> min;

    public Median(){
	max = new PriorityQueue<Integer>(11, new MaxHeap<Integer>());
	min = new PriorityQueue<Integer>(11, new MinHeap<Integer>());	
    }

    public void add(int x){
	if (max.size() > min.size())
	    min.add(x);
	else
	    max.add(x);
    }
    
    public int findMedian(){
	if (max.size() > min.size())
	    return max.peak();
	else
	    return (max.peak() + min.peak()) /2;
    }
    
    public int removeMedian(){
	if (max.size() > min.size())
	    return max.poll();
	else
	    return (max.poll() + min.poll()/2);
    }
}