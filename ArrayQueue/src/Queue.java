
public interface Queue<T> {
	
	public void enqueue(T x) throws Exception;
	public T dequeue()throws Exception;

}
