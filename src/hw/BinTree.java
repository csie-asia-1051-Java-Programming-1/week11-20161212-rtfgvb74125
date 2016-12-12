package hw;

public class BinTree {
	public Node root;

	public BinTree(float v1) {
		root = new Node(v1);
	}

public void addNode(float v1){
	Node tmpNode = root;
	while(true){
		if(v1<tmpNode.getVal()){
			if(tmpNode.getLeftNode()==null){
				tmpNode.addLeftNode(v1);
				break;
			}else{
				tmpNode = tmpNode.getLeftNode();
				continue;
			}
		}else{
			if(tmpNode.getRightNode()==null){
				tmpNode.addRightNode(v1);
				break;
			}else{
				tmpNode = tmpNode.getRightNode();
				continue;
			}
		}
	}
}
public void inOrder(Node node){
	if(node.getLeftNode()!=null){
		inOrder(node.getLeftNode());
	}System.out.print(node.getVal()+"\t");
		if(node.getRightNode()!=null){
			inOrder(node.getRightNode());
		}
	}
}
class Node{
	private Node left,right;
	private float data;
	public Node(float val){
		this.data = val;
		this.left = null;
		this.right = null;
	}
	public float getVal(){
		return this.data;
	}
	public Node getLeftNode(){
		return this.left;
	}
	public Node getRightNode(){
		return this.right;
	}
	public void addLeftNode(float v1){
		this.left = new Node(v1);
	}
	public void addRightNode(float v1){
		this.right = new Node(v1);
	}
}