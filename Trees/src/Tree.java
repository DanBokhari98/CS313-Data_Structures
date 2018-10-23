import java.util.Iterator;
import java.util.ArrayList;

public class Tree{
	protected TNode root;
	public int size;
	
	public Tree() {
		root = null;
		size = 0;
	}
	
	public TNode root() {
		return root;
	}
	
	public TNode parent(TNode node) {
		return node.getParent();
	}
	
	public boolean isInternal(TNode node) {
		return node.children().hasNext();
	}
	
	public boolean isLeaf(TNode node) {
		return !isInternal(node);
	}
	
	public boolean isRoot(TNode node) {
		return node == root;
	}
	
	public int size(){ return size; }
	
	public boolean isEmpty() { return size == 0; }
	
	public int depth(TNode node) {
		if(node == root) return 0;
		return 1 + depth(node.getParent());
	}
	
	public int height(TNode node) {
		if(isLeaf(node)) return 0;
		//Initialize max child height
		int maxChild = 0;
		Iterator<TNode> c = node.children();
		while(c.hasNext()) {
			int hc = height(c.next());
			if(hc > maxChild)
				maxChild = hc;
		}
		return maxChild + 1;
	}
	
	public int height() {
		if(root == null) return -1;
		return height(root);
	}
	
	 public ArrayList<TNode> preOrder() {
	      ArrayList<TNode> list = new ArrayList<>();
	      preOrder(root(), list);
	      return list;
	   }
	 
	 public void preOrder(TNode node, ArrayList<TNode> nodeOrder) {
		 if(node == null) return;
		 nodeOrder.add(node);
		 Iterator<TNode> c = node.children();
		 while(c.hasNext()) {
			 TNode m = c.next();
			 preOrder(m, nodeOrder);
		 }
	 }
	 
	 public ArrayList<TNode> postOrder(){
		 ArrayList<TNode> list = new ArrayList<TNode>();
		 postOrder(root(), list);
		 return list;
	 }
	 
	 public void postOrder(TNode node, ArrayList<TNode> nodeOrder) {
		 if(node == null) return;
		 Iterator<TNode> c = node.children();
		 while(c.hasNext()) {
			 TNode m = c.next();
			 preOrder(m, nodeOrder);
		 }
		 nodeOrder.add(node);
	 }
	
	  
	 public ArrayList<TNode> levelOrder(){
		 ArrayList<TNode> waiting = new ArrayList<>();
		 waiting.add(null);
		 if(root == null) return waiting;
		 int done = 0;
		 while(done < waiting.size()) {
			 TNode oldNode = waiting.get(done++);
			 if(oldNode == null) {
				 if(done < waiting.size()) waiting.add(null);
				 continue;
			 }
			 Iterator<TNode> c = oldNode.children();
			 while(c.hasNext()) waiting.add(c.next());
		 }
		 return waiting;
	 }
	 
}
