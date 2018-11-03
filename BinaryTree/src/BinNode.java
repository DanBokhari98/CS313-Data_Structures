
public class BinNode<T> extends BinaryNode{
	T data;
	
	public BinNode(){
		super();
	}
	
	public BinNode(BinNode<T> p, BinNode<T> l, BinNode<T> r, T d) {
		super(p, l, r);
		data = d;
	}
	
	public T getData() { return data; }
	public void setData(T x) { data = x; }

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return null;
	} 
}
