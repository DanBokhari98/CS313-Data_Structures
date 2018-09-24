public class Node<T> {
	
	public T data;
	public Node<T> next;
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T d) {
		this.data = d;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
}
