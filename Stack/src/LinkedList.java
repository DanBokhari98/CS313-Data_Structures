
public class LinkedList<T> {
	Node<T> head, tail;
	int size;
	
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addHead(T b) {
		Node<T> newNode = new Node<>(b, head);
		head = newNode;
		size++;
		if(size == 1) tail = head;
	}
	
	public void addAfter(Node<T> n, T data) {
		if(n == null) {
			throw new IllegalArgumentException("Nah b we cant do that");
		}
		//Creates a node with some data
		Node<T> newNode = new Node<>(data, null);
		//Get the node that n is pointing too
		Node<T> nodeAfter = n.next;
		//Adds the new node after n
		n.next = newNode;
		//the New node points to the node that n was previously pointing
		newNode.next = nodeAfter;
	}
	
	public void addTail(T b) {
		Node<T> n = new Node<>(b, null);
		if(tail != null) {
		tail.setNext(n);
		}
		tail = n;
		size++;
		if(head == null) head = n; 
	}
	
	public T removeHead() throws Exception {
		if(head == null) {
			throw new Exception("List is empty");
		}
		
		T ans = head.getData();
		head = head.getNext();
		size--;
		if(head == null) {
			tail = null;
		}
		
		return head.getData();
		
	}
	
	//We don't need to Remove tail because
	//That requires linear search 
	
	public T removeAfter(Node<T> n) throws Exception{
		if(n == null || n == tail) {
			throw new Exception("No such node");
		}
		if(n.getNext() == tail) {
			tail = n;
		}
		size--;
		T ans = n.getNext().getData();
		n.setNext(n.getNext().getNext());
		return ans;
	}
	
	public Node<T> getHead() throws Exception{
		if(head == null) throw new Exception("No head");
		return head;
	}
	
	public Node<T> lastButOne()throws Exception{
		if(head == tail) throw new Exception("No such node");
		Node<T> p = head;
		while(p.getNext() != tail) {
			if(p.getNext() == tail) return p;
			
			p = p.getNext();
		}
		return p;
	}
	
	 public void printList() 
	    { 
	        Node<T> tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" --> "); 
	            tnode = tnode.next; 
	        } 
	    } 
	
}
