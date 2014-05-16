import java.util.Comparator;

public class MinComp implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
	return a.compareTo(b);
    }
    
    public boolean equals(Object obj){
	return false;
    }

}
