public class MyLinkedList{
    
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }// useless, head null anyways

    public void add(String d){
	Node tmp = new Node(d);

	tmp.setNext(head);
	head = tmp;

    }

    public void add(int i, String s){
	
	if (i == 0)
	    add(s);

	else{
	    Node tmp = head;
	    for(int a = 0; a < i-1; a++){
		tmp = tmp.getNext();
	    }
	    Node tmp2 = tmp.getNext();
	    tmp.setNext(new Node(s));
	    tmp.getNext().setNext(tmp2);
	}
	
    }
    
    public String get(int i){
	Node tmp = head;
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.toString();
    }
    
    public String set(int i, String s){
	Node tmp = head;
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.setData(s);
    }
    
    public String remove(int i){
	if (i == 0){
	    String s = head.getData();
	    head = head.getNext();
	    return s;
	}
	else{
	    Node tmp = head;
	    for(int a = 0; a < i-1; a++)
		tmp = tmp.getNext();
	    return tmp.setNext(tmp.getNext().getNext()).getData();
	}
	
    }
    
    public int find (String s){
	Node tmp = head;
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
	Node tmp = head;
	int i = 0;
	while (tmp != null){
	    tmp = tmp.getNext();
	    i++;
	}
	return i;
    }
		       
	
    public String toString(){
	String s ="";
	Node tmp = head;
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
	System.out.println("asd");
	System.out.println(asd.toString());
	
	asd.add(0,"head");
	asd.add(4,"middl");
	asd.add(asd.length(),"tail");	

	System.out.println(asd);
	System.out.println(asd.set(8, "mid"));

	System.out.println(asd);
    }
    
}
