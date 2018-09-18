
public class DNode<T> {
	
	private T data;
	private DNode<T> prev, next;
	
	public DNode(T data, DNode<T> prev, DNode<T> next) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public void setNext(DNode<T> n) {
		next = n;
	}
	
	public void setPrev(DNode<T> p) {
		prev = p;
	}
	
	public T getData() {
		return data;
	}
	
	public DNode<T> getNext(){
		return next;
	}
	
	public DNode<T> getPrev(){
		return prev;
	}
}
