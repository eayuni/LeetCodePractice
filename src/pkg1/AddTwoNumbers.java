package pkg1;
import  linkedlist.Node;
//2. Add Two Numbers
public class AddTwoNumbers {
	
	public class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) { val = x; }
	 }
	 public static ListNode addTwoNumbers(Node l1, Node l2) {
	        return helper(l1, l2, 0);
	    }
	    
	    public static Node helper(Node l1, Node l2, int carry) {
	        if (l1 == null && l2 == null && carry == 0) {
	            if (carry == 0) return null;
	            else return new Node(1);
	        }
	        
			// Ternary functions avoid NullPointerExceptions
	        int sum = ((l1 == null) ? 0 : l1.getData()) + ((l2 == null) ? 0 : l2.getData()) + carry;
	        ListNode head = new ListNode(sum % 10);
	        
			// Set the next pointer to be the sum of the next element of the two lists and the carry
	        head.next = helper((l1 == null) ? null : l1.getNextNode(), (l2 == null) ? null : l2.getNextNode(), sum / 10);
	        
	        return head;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node l1= new Node(0);
	l1.setData(2);
		
		
		Node l2= new Node(1);
		l1.setData(2);
		
		System.out.println(addTwoNumbers(l1,l2));
		

	}

}
