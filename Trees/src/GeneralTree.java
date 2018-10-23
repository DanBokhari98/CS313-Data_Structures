
public class GeneralTree<T> extends Tree{
	
	public GeneralTree() {
		super();
	}
	
	public void add(T x) throws Exception {
		if(root != null) throw new Exception();
		root = new GTNode<T>(x, null);
		size++;
	}
	
	public void add(GTNode<T> position, T data){
		position.add(new GTNode<T>(data, position));
		size++;
	}
	
	
	public void add(GTNode<T> position, int i, T data) throws Exception {
		if(position.numberOfChildren() < i || i == 0) throw new Exception();
		position.add(i, new GTNode<T>(data, position));
		size++;
	}
	
	public GTNode<T> remove(GTNode<T> node){
		GTNode<T> parent = (GTNode<T>) node.getParent();
		size -= node.size();
		if(parent == null) root = null;
		else parent.remove(node);
		return parent;
	}
}
