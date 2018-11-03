import java.util.ArrayList;

public abstract class BinaryTree extends Tree {
	
	public BinaryTree() {
		super();
	}
	
	public void addRoot(BinaryNode node) throws Exception {
		if (root != null) throw new Exception("The tree is not empty");
	    root = node;
	    size++;
	   }
	
	public void addLeft(BinaryNode node, BinaryNode newChild) throws Exception{
		if(node.getLeft() != null) throw new Exception("Left child exist");
		node.setLeft(newChild);
		newChild.setParent(node);
		size++;
	}
	
	public void addRight(BinaryNode node, BinaryNode newChild) throws Exception{
		if(node.getRight() != null) throw new Exception("Right child exist");
		node.setRight(newChild);
		newChild.setParent(node);
		size++;
	}
	
	public BinaryNode removeNode(BinaryNode node) {
		if(isLeaf(node)) {
			BinaryNode parent = (BinaryNode) node.getParent();
			if(parent == null) root = null;
			else parent.removeChild(node);
			size--;
			return parent;
		}
		BinaryNode lower = descendant(node);
		promote(lower, node);
		return removeNode(lower);
	}
	
	public BinaryNode removeNodeWithHeir(BinaryNode node) {
		if(isLeaf(node)) node = null;
		BinaryNode temp = descendant(node);
		node = temp;
		temp = null;
		return node;
	}
	
	protected abstract void promote(BinaryNode lower, BinaryNode node);
	protected abstract BinaryNode descendant(BinaryNode node);
	
	
	public ArrayList<TNode> inOrder(){
		ArrayList<TNode> answer = new ArrayList<TNode>();
		inOrder((BinaryNode) root(), answer);
		return answer;
	}
	
	public void inOrder(BinaryNode n, ArrayList<TNode> v) {
		if(n == null) return;
		inOrder(n.getLeft(), v);
		v.add(n);
		inOrder(n.getRight(), v);
	}
	
	
}
