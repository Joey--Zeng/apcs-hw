import java.util.Comparator;

public class MaxComp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
	return b.compareTo(a);
    }
    
    public boolean equals(Object obj){
	return false;
    }

}
