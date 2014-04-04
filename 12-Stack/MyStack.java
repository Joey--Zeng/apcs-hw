

public class MyStack{
    
    private Node top;
    
    public MyStack(){
	
    }

    public void push(String s){
	Node a = new Node(s);
	a.setNext(top);
	top = a;
    }

    public boolean isEmpty(){
	return top==null;
    }

    public String pop(){
	Node aaa = top;
	top = top.getNext();
	return aaa.getData();
    }

    public String toString(){
	String s = "";
	Node tmp = top;
	while(tmp!=null){
	    s = s + tmp.getData() + ", ";
	    tmp = tmp.getNext();
	}
	return s.substring(0,s.length()-2);
    }
	

    public static void main(String[] args){
	MyStack a = new MyStack();
	a.push("asdasda");
	a.push("194");
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