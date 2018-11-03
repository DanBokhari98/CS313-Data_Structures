import java.util.ArrayList;
import java.util.Iterator;

public abstract class BinaryNode implements TNode {
	BinaryNode left, right, parent;
	
	public BinaryNode() {
		parent = left = right = null;
	}
	
	public BinaryNode(BinaryNode p, BinaryNode l, BinaryNode r) {
		parent = p;
		right = r;
		left = l;
	}
	
	@Override 
	public Iterator<TNode> children(){
		ArrayList<TNode> children = new ArrayList<>();
		if(left != null) children.add(left);
		if(right != null) children.add(right);
		return children.iterator();
	}
	
	@Override
	public TNode getParent() {
		return parent;
	}
	
	public void setLeft(BinaryNode l) { left = l; }
	public void setRight(BinaryNode r) { right = r; }
	public void setParent(BinaryNode node) { parent = node; }
	public BinaryNode getLeft() { return left; }
	public BinaryNode getRight() { return right; }
	
	
	public void removeChild(BinaryNode n) {
		if(getLeft() == n) setLeft(null);
		if(getRight() == n) setRight(null);
	}
	
}
