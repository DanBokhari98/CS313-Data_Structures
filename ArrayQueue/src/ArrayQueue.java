
public class ArrayQueue<T> implements Queue<T>{

	private T data[];
	private int front, rear, size, cap;
	
	
	public ArrayQueue() {
		cap = 1000;
		// Must cast T array to Object Array
		data = (T[])new Object[cap];
		front = rear = size = 0;
	}
	
	public ArrayQueue(int x) {
		cap = x;
		// Must cast T array to Object Array
		data = (T[]) new Object[cap];
		front = rear = size = 0;
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0;}
	
	@Override
	public void enqueue(T x) throws Exception {
		if(size() == cap) throw new Exception("Array full");
		data[rear++] = x;
		if(rear == cap) rear = 0;
		size++;
		
	}

	@Override
	public T dequeue() throws Exception {
		if(isEmpty()) throw new Exception("Empty list");
		T answer = (T) data[front++];
		if(front == cap) front = 0;
		size--;
		return answer;
	}

}
