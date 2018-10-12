
public class Node<T> {
		private T data;
		private Node<T> next;
		public Node(T e, Node<T> n) {
			data = e;
			next = n;
		}
		public T getData() {
			return data;
		}
		public Node<T> getNext() {
			return next;
		}
		public void setNext(Node<T> n) {
			next = n;
		}

	}
