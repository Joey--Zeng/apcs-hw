
public class BST {
    private Node root;
    
    public BST() {
        root = null;
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
	
	System.out.println(a.search2(a.getRoot(),10));
	System.out.println(a.search2(a.getRoot(),8));
	System.out.println(a.search2(a.getRoot(),3));
	System.out.println(a.search2(a.getRoot(),7));
	System.out.println(a.search2(a.getRoot(),19));
	System.out.println(a.search2(a.getRoot(),14));
	System.out.println(a.search2(a.getRoot(),6));
	System.out.println(a.search2(a.getRoot(),2));
	System.out.println(a.search2(a.getRoot(),1));
    }
       
}
