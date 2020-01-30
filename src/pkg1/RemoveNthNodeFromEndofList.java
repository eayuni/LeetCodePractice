package pkg1;
import linkedlist.ListNode;
//19. Remove Nth Node From End of List
public class RemoveNthNodeFromEndofList {
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
		 ListNode current = new ListNode(0);
		    ListNode before = current, following = current;
		    before.next = head;
		        
		    for(int i=1; i<=n+1; i++)   {
		        following = following.next;
		    }
		   
		    while(following != null) {
		        before = before.next;
		        following = following.next;
		    }
		    
		    before.next = before.next.next;
		    return current.next;
		 
		 }
		 
		
		 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n = new ListNode(1);
		ListNode n2 = new ListNode(2);

		n.setNext(n2);
		n.next.setVal(4);
		
		int a =2;
		
		System.out.println(removeNthFromEnd(n,a));

	}

}
