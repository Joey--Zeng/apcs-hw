
public class HeapSort{
    
    
    public static void heapAdd(Comparable[] Arr, Comparable a){	
	Arr[count(Arr)] = a;
	up(Arr,count(Arr)-1);
    }
    
    public static int count(Comparable[] Arr){
	for (int i = Arr.length - 1; i>= 0; i--)
	    if (Arr[i] != null)
		return i+1;
	return 0;
    }


    

    public static void down(Comparable[] Arr, int index){
	
	while (index*2+2 <= count(Arr)){
	    if (index*2+2 < count(Arr)){
		if(Arr[index*2+2].compareTo(Arr[index*2+1]) > 0){
		    if(Arr[index*2+2].compareTo(Arr[index]) > 0){
			swap(Arr,index*2+2,index);
			index = index*2+2;			
		    }
		    else break;
		}							
		else if(Arr[index*2+1].compareTo(Arr[index]) > 0){
		    swap(Arr,index*2+1,index);
		    index = index*2+1;
		}
		else break;		
	    }
	    else if (Arr[index*2+1].compareTo(Arr[index]) > 0){
		swap(Arr,index*2+1,index);
		index = index*2+1;
	    }
	    else break;
	}
    }
    
    
    public static Comparable removeMax(Comparable[] Arr){
	Comparable ret = Arr[0];
	Arr[0] = null;
	if (count(Arr) != 0) {
	    swap(Arr, 0, count(Arr)-1);
	    down(Arr, 0);

	}
	return ret;
    }
    
    public static void up(Comparable[] Arr, int index){
	while(index != 0 && Arr[(index-1)/2].compareTo( Arr[index]) <= 0){
	    swap(Arr, index, (index-1)/2);
	    index = (index-1)/2;
	}
    }
    public static void swap(Comparable[] Arr, int i, int i2){
	Comparable t = Arr[i];
	Arr[i] = Arr[i2];
	Arr[i2] = t;
    }

    public static void heapSort(Comparable[] Arr){
	Comparable[] copy = new Comparable[count(Arr)];

	for(int i = count(Arr)-1; i >= 0; i--){
	    heapAdd(copy, Arr[i]);
	}
	for(Comparable a: copy){
	    System.out.print(a+" ");
	}
	System.out.println();
	
	for(int i = count(Arr)-1; i >= 0; i--){

	    Arr[i] = removeMax(copy);
	    for(Comparable a: copy){
		System.out.print(a+" ");
	    }
	    System.out.println();
	}
	
	for(Comparable a: Arr){
	    System.out.print(a+" ");
	}
	System.out.println();
	
    }
    


    public static void main(String[] args){
	Integer[] a = new Integer[10];
	for(int i = 0; i < 10; i++){
	    a[i] = (int)(Math.random() * 300);
	}
	heapSort(a);
    }
}




