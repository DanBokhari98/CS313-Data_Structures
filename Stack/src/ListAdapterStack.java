public class ListAdapterStack <T> implements Stack <T>{
	
	private LinkedList<T> data;

	public void push(T t) {
		data.addHead(t);
		
	}
	
	public ListAdapterStack() {
		data = new LinkedList<>();
	}
	
	public T pop() {
		T t = null;
				try {
					t = data.getHead().getData();
				} catch (Exception e1) {
				// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		try {
			data.removeHead();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

}
