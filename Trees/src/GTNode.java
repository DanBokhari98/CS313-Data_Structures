import java.util.ArrayList;
import java.util.Iterator;

public class GTNode<T> implements TNode {
	
	T data;
	GTNode<T> parent;
	private ArrayList<TNode> children;
	
	public GTNode(T d, GTNode<T> p) {
		parent = p;
		data = d;
		children = new ArrayList<TNode>();
	}
	
	public void add(GTNode<T> node) { children.add(node); }
	public void add(int i, GTNode<T> node) { children.add(i, node); }
	public GTNode<T> get(int i){ return (GTNode<T>) children.get(i); }
	public int numberOfChildren() { return children.size(); }
	
	public int size() {
		int count = 1;
		Iterator<TNode> c = children();
		while(c.hasNext())
			count += ((GTNode<T>) c.next()).size();
		return count;
	}
	
	public void remove(GTNode<T> x){
		children.remove(x);
	}
	
	@Override
	public Iterator<TNode> children() {
		return children.iterator();
	}

	@Override
	public TNode getParent() {
		return parent;
	}

	@Override
	public String printData() {
		return data.toString();
	}

}
