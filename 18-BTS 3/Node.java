public class Node {
    private int data;
    private Node left,right;
    
    public Node(int a){
	data = a;
    }

    public void setData(int a){
	data = a;
    }
    
    public int getData(){
	return data;
    }

    public Node getLeft(){
	return left;
    }

    public void setLeft(Node a){
	left = a;
    }

    public Node getRight(){
	return right;
    }

    public void setRight(Node a){
        right = a;
    }
    
    public String toString(){
	return ""+data;
    }
	
    // write all necessary constructors and get/set methods
}
