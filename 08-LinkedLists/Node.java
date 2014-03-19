public class Node{
    private String data;
    private Node next;

    public Node(String d){
	data = d;
	next = null;
    }
    
    public String setData(String d){
	String asd = getData();
	data = d;
	return asd;
    }
    public String getData(){
	return data;
    }
    public Node setNext(Node n){
	Node asd = getNext();
	next = n;
	return asd;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }

/*

    public static void main(String[] args){
	Node n1 = new Node("Sully");
	Node n2 = new Node("Mike");
	n1.setNext(n2); // Sully ~> Mike
	n1.getNext().setNext(new Node("Randall")); //Sully ~> Mike ~> Randall
	n1.setNext(n1.getNext(),getNext()); //get rid of Mike, Sully ~> Randall
	

    }
*/
}
