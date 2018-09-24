
public class Main {
	public static void main(String [] args) {
		DLinkedList<Integer> list = new DLinkedList<>();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		DNode<Integer> p = null;
		list.printList();
		try {
			// DNode 1
			p = list.getFirst();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//DNode 2
		p = p.getNext();
		
		//DNode 3
		p = p.getNext();
		
		try {
			//removing DNode 2
			list.removeBefore(p);
			//Removing DNode 5
			list.removeAfter(p.getNext());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		list.printList();
	}
}
