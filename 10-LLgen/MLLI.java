import java.util.Iterator;

public class MLLI<E> implements Iterator<E>{
    private Node<E> currentNode;
    public MLLI(Node<E> n){
	currentNode = n;
    }
    public boolean hasNext(){
	return currentNode.getNext() == null;
    }
    public E next(){
	E next = currentNode.getData();
	currentNode = currentNode.getNext();
	return next;
    }
    public void remove(){}
}