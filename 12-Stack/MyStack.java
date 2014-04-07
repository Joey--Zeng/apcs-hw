

public class MyStack{
    
    private String[] a;
    int i;
    
    public MyStack(){
	a = new String[10];
	i=-1;
    }

    public void push(String s){
	if (i+1 >= a.length){
	    String[] aa = new String[2*a.length];
	    for(int b = 0; b < a.length; b++)
		aa[b] = a[b];
	    a = aa;
	}
	a[++i] = s;
    }
    
    public boolean isEmpty(){
	return i==0;
    }
    
    public String pop(){
	String asd = a[i];
        a[i--] = null;
	return asd;
    }

    public String toString(){
	String s = "";

	for(int z = 0; z < i; z++){
	    s = s + a[i-z-1] + ", ";	 
	}
	return s.substring(0,s.length()-2);
    }
	

    public static void main(String[] args){
	MyStack a = new MyStack();
	a.push("asdasda");
	a.push("194");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	a.push("213152");
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a);
	System.out.println(a.pop());
	System.out.println(a.pop());
    }
}
