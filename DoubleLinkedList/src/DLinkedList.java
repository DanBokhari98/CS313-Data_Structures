import javax.xml.soap.Node;

public class DLinkedList<T> {
	
	//Need sentinels
	private DNode<T> header, trailer;
	private int size;
	
	public DLinkedList() {
		size = 0;
		header = new DNode<T>(null,null,null);
		trailer = new DNode<T>(null, header, null);
		header.setNext(trailer);
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public DNode<T> getFirst() throws Exception {
		if(isEmpty()) throw new Exception("No");
		return header.getNext(); 
	}
	
	public DNode<T> getLast() throws Exception{
		if(isEmpty())throw new Exception("NO");
		return trailer.getPrev();
	}
	
	public DNode<T> getNext(DNode<T> v) throws Exception{
		DNode<T> ans = v.getNext();
		if(ans == null || ans == trailer) throw new Exception("Stop");
		return ans;
	}
	
	public DNode<T> getPrev(DNode<T> v) throws Exception{
		DNode<T> ans = v.getPrev();
		if(ans == null || ans == header) throw new Exception("Stop");
		return ans;
	}
	
	public void addAfter(T d, DNode<T> v){
		DNode<T> w = v.getNext();
		DNode<T> x = new DNode<T>(d, v, w);
		v.setNext(x);
		w.setPrev(x);
		size++;
	}
	
	public void addBefore(T d, DNode<T> v) {
		DNode<T> w = v.getPrev();
		DNode<T> x = new DNode<T>(d, w, v);
		v.setPrev(x);
		w.setNext(x);
		size++;
	}
	
	public void addFirst(T d) {
		addAfter(d, header);
	}
	
	public void addLast(T d) {
		addBefore(d, trailer);
	}
	
	public T remove(DNode<T> v) throws Exception{
		if(v == header || v == trailer) throw new Exception("STOP");
		DNode<T> u = v.getPrev();
		DNode<T> w = v.getNext();
		w.setPrev(u);
		u.setNext(w);
		size--;
		return v.getData();
	}
	
	public T removeAfter(DNode<T> v) throws Exception{
		if(v.getNext() == trailer || v == trailer)throw new Exception("Cant do that");
		DNode<T> w = v.getNext().getNext();
		DNode<T> u = v.getPrev();
		w.setPrev(v);
		v.setNext(w);
		size--;
		return v.getData();
	}
	
	public T removeBefore(DNode<T> v) throws Exception{
		if(v == header || v == trailer) throw new Exception("CANT DO THAT");
		if(v.getPrev() == header) throw new Exception("Only node available");
		DNode<T> w = v.getPrev().getPrev();
		w.setNext(v);
		v.setPrev(w);
		size--;
		return v.getData();
	}
	
	public void printList() {
		DNode<T> p = header.getNext();
		while(p != null) {
			if(p.getData() == null) {
				break;
			}
			System.out.print(p.getData() + " <--> ");
			p = p.getNext();
			
		}
	}
}
