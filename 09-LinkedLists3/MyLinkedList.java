public class MyLinkedList{
    
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList(){
	head = new Node("");
	tail = head;
    }

    public void add(String d){
	tail.setNext(new Node(d));
	tail = tail.getNext();

	length++;

    }

    public void add(int i, String s){
	
	Node tmp = head;
	for(int a = 0; a < i; a++){
	    tmp = tmp.getNext();
	}
	Node tmp2 = tmp.getNext();
	tmp.setNext(new Node(s));
	tmp.getNext().setNext(tmp2);
	if (tmp2 == null)
	    tail = tail.getNext();
       
	
	length++;
    }
    
    public String get(int i){
	Node tmp = head.getNext();
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.toString();
    }
    
    public String set(int i, String s){
	Node tmp = head.getNext();
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.setData(s);
    }
    
    public String remove(int i){

	Node tmp = head;
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	length--;
	return tmp.setNext(tmp.getNext().getNext()).getData();
	

	
    }
    
    public int find (String s){
	Node tmp = head.getNext();
	int i = 0;
	while (tmp != null){
	    if (tmp.getData().equals(s))
		return i;
	    else{
		tmp = tmp.getNext();
		i++;
	    }
	}
	return -1;
    }

    public int length(){    
	return length;
    }
		       
	
    public String toString(){
	String s ="";
	Node tmp = head.getNext();
	while(tmp != null){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    
    public static void main (String[] args){
	MyLinkedList asd = new MyLinkedList();
	asd.add("Joey");
	asd.add("Joey1");
	asd.add("Joey2");
	asd.add("Joey3");
	asd.add("Joey4");
	asd.add("Joey5");

	System.out.println(asd);
	
	asd.add(0,"head");
	asd.add(4,"middl");
	asd.add(asd.length(),"tail");	


	System.out.println(asd);
	System.out.println(asd.remove(5));

	System.out.println(asd);
    }
    
}
