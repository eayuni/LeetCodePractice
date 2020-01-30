package linkedlist;

public class ListNode {
    public static int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
    
	public static int getVal() {
		return val;
	}
	public void setVal(int val) {
		ListNode.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	private Node head;
	
   
    
   
	}

