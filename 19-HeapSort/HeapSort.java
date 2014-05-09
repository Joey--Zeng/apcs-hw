
public class HeapSort{
    
    
    public static void heapAdd(Comprable[] Arr, Comprable a){	
	Arr[count(Arr)]
	
    }
    
    public static int count(Comprable[] Arr){
	for (int i = Arr.length - 1; i>= 0; i--)
	    if (a[i] != null)
		return i+1;
	return 0;
    }


    //adjust indexes

    public static void down(Comprable[] Arr, int index){
	if( index*2 == count(Arr)){
	    if (Arr[index*2].compareTo(Arr[index]) > 0){
		swap(Arr, index*2, index);
		return down(Arr, index*2);
	    }
	    
	}
	else if ( index*2 > count(Arr)){
	    if (Arr[index*2].compareTo(Arr[index*2+1]) > 0){
		if (Arr[index*2].compareTo(Arr[index]) > 0){
		    swap(Arr, index*2, index);
		    return down(Arr, index*2);
		}
	    }
	    else
		if (Arr[index*2+1].compareTo(Arr[index]) > 0){
		    swap(Arr, index*2+1, index);
		    return down(Arr, index*2+1);
		}
	    
	}
	
    }
    
    public static void swap(Comprable[] Arr, int i, int i2){
	Comprable t = a[i];
	a[i] = a[i2];
	a[i2] = t;
    }

    public static void removeMax(Comprable[] Arr){
	
    }



}