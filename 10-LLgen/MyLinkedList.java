import java.util.*;

public class MyLinkedList<E> implements Iterable{
    
    private Node<E> head;
    private Node<E> tail;
    private int length;


    public Iterator<E> iterator(){
	return new MLLI<E>(head);
    }

    
    public MyLinkedList(){
	head = new Node<E>(null);
	tail = head;
    }

    public void add(E d){
	tail.setNext(new Node<E>(d));
	tail = tail.getNext();

	length++;

    }

    public void add(int i, E s){
	
	Node<E> tmp = head;
	for(int a = 0; a < i; a++){
	    tmp = tmp.getNext();
	}
	Node<E> tmp2 = tmp.getNext();
	tmp.setNext(new Node<E>(s));
	tmp.getNext().setNext(tmp2);
	if (tmp2 == null)
	    tail = tail.getNext();
       
	
	length++;
    }
    
    public E get(int i){
	Node<E> tmp = head.getNext();
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.getData();
    }
    
    public E set(int i, E s){
	Node<E> tmp = head.getNext();
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	return tmp.setData(s);
    }
    
    public E remove(int i){

	Node<E> tmp = head;
	for(int a = 0; a < i; a++)
	    tmp = tmp.getNext();
	length--;
	return tmp.setNext(tmp.getNext().getNext()).getData();
	

	
    }
    
    public int find (E s){
	Node<E> tmp = head.getNext();
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
	return s.toString();
    }
    
    public static void main (String[] args){
	MyLinkedList<String> asd = new MyLinkedList<String>();
	Iterator<String> it = asd.iterator();

	
	asd.add("Joey");
	asd.add("Joey1");
	asd.add("Joey2");
	asd.add("Joey3");
	asd.add("Joey4");
	asd.add("Joey5");
	
	System.out.println(it.hasNext());	
	while (it.hasNext()){	       
		System.out.println(it.next());
	}
	
	/*
	System.out.println(asd);
	
	asd.add(0,"head");
	asd.add(4,"middl");
	asd.add(asd.length(),"tail");	


	System.out.println(asd);
	System.out.println(asd.remove(5));

	System.out.println(asd);
	*/
    }
    
}
