

public class LinkedQueue<T> implements Queue<T> {
	
	private Node<T> front, tail;
	private int size;
	
	@Override
	public void enqueue(T x) {
		Node<T> newRear = new Node<T>(x, null);	
		if(tail != null) tail.setNext(newRear);
		else front = newRear;
		tail = newRear;
		size++;
	}

	
	@Override
	public T dequeue() throws Exception {
		if(front == tail && tail == null) throw new Exception("hehe");
		T answer = front.getData();
		front = front.getNext();
		size--;
		return answer;
	}


}
