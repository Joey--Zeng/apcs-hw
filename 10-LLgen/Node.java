public class Node<E>{
    private E data;
    private Node<E> next;

    public Node(E d){
	data = d;
	next = null;
    }
    
    public E setData(E d){
	E asd = getData();
	data = d;
	return asd;
    }
    public E getData(){
	return data;
    }
    public Node<E> setNext(Node<E> n){
	Node<E> asd = getNext();
	next = n;
	return asd;
    }
    public Node<E> getNext(){
	return next;
    }
    public String toString(){
	return data.toString();
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
