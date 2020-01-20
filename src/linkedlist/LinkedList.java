package linkedlist;

public class LinkedList {
	
	private Node head;
	
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	Node reverse(Node n) {
		
		Node prev=  null;
		Node current= this.head;
		Node following = this.head;
		
		while(current != null) {
			following= following.getNextNode();
			current.setNextNode(prev);
			prev=current;
			current= following;
			
		}
		
		this.head=prev;
		
		return n;
		
	}
	
	
	
	public void insertAtHead(int data) {
		
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while(current != null) {
			length++;
			current = current.getNextNode();
			
			}
		
		return length;
		
	}
	
	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}
	
	public Node find(int data) {
		Node current= this.head;
		
		while(current != null) {
			if(current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
			
		}
		
		return null;
		
		
	}
	
	
	@Override
	public String toString() {
		String result ="{";
		
		Node current= this.head;
		
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		 result +="}";
		 
		 return result;
	
}

}
