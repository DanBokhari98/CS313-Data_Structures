
public interface Queue<T> {
	
	public void  enqueue(T x);
	T dequeue() throws Exception;
	
}
