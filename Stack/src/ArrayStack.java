
public class ArrayStack<T> {
	private T data[];
	private int top;
	
	public ArrayStack() {
		data = (T[]) new Object[1000];
		top = -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public void push(T x) throws Exception {
		if(size() == 1000) throw new Exception("Stack Full");
		data[++top] = x;
	}
	
	public T pop() throws Exception{
		if(size() == -1) throw new Exception("Empty");
		return data[top--];
		
	}
	
}
