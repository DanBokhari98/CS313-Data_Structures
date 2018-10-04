
public class LinkedStack <T>{
	private Node<T> top;
	private int size;
	
	private LinkedStack() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return size==0;}
	
	public T pop() throws Exception{
		if(isEmpty()) throw new Exception("Empty");
		T answer = top.getData();
		top = top.next;
		size--;
		return answer;
	}
}
