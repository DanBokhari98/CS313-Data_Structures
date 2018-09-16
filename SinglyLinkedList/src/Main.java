
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
		
	}
}
