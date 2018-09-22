
public class Main {
	public static void main(String [] args) {
		LinkedList<String> yer = new LinkedList<>();
		yer.addHead("First");
		yer.addAfter(yer.head, "Second");
		yer.addAfter(yer.head.next, "Third");
		yer.printList();
		System.out.println();
		try {
		yer.removeAfter(yer.head.next);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		LinkedList<Integer> test = new LinkedList<>();
		test.addHead(0);
		test.addTail(1);
		test.addTail(0);
		test.addTail(2);
		test.addTail(0);
		test.addTail(5);
		test.addTail(0);
		test.addTail(4);
		test.addTail(0);
		test.printList();
		System.out.println();
		//moveZeros(test);
		removeMiddle(test);
		test.printList();
		
	}
	public static void moveZeros(LinkedList<Integer> l) {
		//initialize a new Node to reference the list head
		 Node<Integer> p = l.head;
		 //Check that the list is not empty
		 while(p != null) {
			 //if the next node is a 0 then
			 if(p.getNext().getData() == 0) {
				 //We create a temp node containing the next node in the list
				 Node<Integer> temp = p.getNext();
				 //we traverse the list by setting the next node to the next node from temp
				 p.setNext(temp.getNext());
				 //we put the 0 before the head. So we set the next node the head
				 temp.setNext(l.head);
				 // the new head is a 0
				 l.head = temp;
			 }
			 //Traversing the list outside of the if statement.
			 p = p.getNext();
		 }
	 }
	
	// We want to remove 0 in the 5th spot
	
	public static void removeMiddle(LinkedList<Integer> l){
		int size = l.size();
		int counter = 0;
		int middle;
		if(size % 2 == 0) {middle = size / 2;}
		else {middle = (size + 1) / 2;}
		Node<Integer> node = l.head;
		while(counter <= middle) {
			counter++;
			// When we arrive to node number 5
			// We want to remove it from the list
			if(counter == middle - 1) {
				node.setNext(node.getNext().getNext());
				counter++;
			}
			node = node.getNext();
		}
		
	}
	
//	public static void moveZero(LinkedList<Integer> l){
//	    Node<Integer> new_Node = l.head;
//	    while(new_Node!=null){
//	      if(new_Node.getNext().getData() == 0) {
//	        Node<Integer> tempNode = new_Node.getNext();
//	        new_Node.setNext(tempNode.getNext());
//	        tempNode.setNext(l.head);
//	        l.head = tempNode;
//	      }
//	      new_Node = new_Node.getNext();
//	    }
//	
	
	
	
	
	
	
}
