
public class BST {
    private Node dummy;
    private Node root;
    
    public BST() {	
        root = null;
	dummy = new Node(0);
	dummy.setLeft(root);
    }

    public Node getRoot(){
	return root;
    }

    public void insert(int a){
	Node back = new Node(0);
	Node piggy = root;
	boolean leftFalse = false;
	if (piggy == null){
	    root = new Node(a);
	    return;
	}
	while(piggy != null){
	    if (piggy.getData() < a){
		back = piggy;
		piggy = piggy.getRight();
		leftFalse = true;
	      
	    }
	    else{
	        back = piggy;
		piggy = piggy.getLeft();
		leftFalse = false;
	    }
	}
	if(leftFalse)
	    back.setRight(new Node(a));
	else
	    back.setLeft(new Node(a));
    }
    
	

		
    public Node search(int a){
	Node asd = root;
	while (asd.getData() != a){
	    if (asd.getData() < a){
		if (asd.getRight() == null)
		    return null;
		asd = asd.getRight();
	    }
	    
	    else if (asd.getData() > a){
		if (asd.getLeft() == null)
		    return null;
		asd = asd.getLeft();
		
	    }
	}
	return asd;
    }

    public Node search2(Node n, int a){
	if(n == null || n.getData() == a){
	    return n;
	}
	else{
	    if (n.getData() < a){
		return search2(n.getRight(),a);
	    }
	    else
		return search2(n.getLeft(),a);
	}
    }

    //==================================================================

    public void remove(int a){
	Node curr = search(a);
	Node b4 = searchRetB4(a);
	if (curr.getRight()!= null && curr.getLeft()!= null){  //2 children	
	    int i = minValue(curr);
	    remove(i);
	    curr.setData(i);
	}
	else{                         //1 child or no children
	    if(b4.getData() > a)
		b4.setLeft(b4.getLeft().getLeft());
	    else
		b4.setRight(b4.getRight().getRight());
	}
    }			    		
    
    
    public Node searchRetB4(int a){
	Node ret = dummy;
	Node asd = root;
	while (asd.getData() != a){
	    if (asd.getData() < a){
		if (asd.getRight() == null)
		    return null;
		ret = asd;
		asd = asd.getRight();
	    }
	    
	    else if (asd.getData() > a){
		if (asd.getLeft() == null)
		    return null;
		ret = asd;
		asd = asd.getLeft();		
	    }
	}
	return ret;
    }
    
    public int minValue(Node a){
	if(a.getLeft() == null)
	    return a.getData();
	else
	    return minValue(a.getLeft());
    }

    
    public static void main(String[] args){
	BST a = new BST();
	a.insert(10);
	a.insert(8);
	a.insert(3);
	a.insert(7);
	a.insert(19);
	a.insert(14);
	a.insert(6);
	a.insert(2);
	a.insert(15);
	a.insert(12);
	
	a.remove(14);
	System.out.println(a.search2(a.getRoot(),10));
	System.out.println(a.search2(a.getRoot(),8));
	System.out.println(a.search2(a.getRoot(),3));
	System.out.println(a.search2(a.getRoot(),7));
	System.out.println(a.search2(a.getRoot(),19));
	System.out.println(a.search2(a.getRoot(),14));
	System.out.println(a.search2(a.getRoot(),6));
	System.out.println(a.search2(a.getRoot(),2));
	//System.out.println(a.searchRetB4(6));
	System.out.println(a.search2(a.getRoot(),1));
    }
       
}
