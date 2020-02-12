package pkg1;
//189. Rotate Array



public class RotateList {
	
	 
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	 

	    public ListNode rotateRight(ListNode head, int k) {
	    	if(head == null ||  head.next == null){
	            return head;
	        }
	        
	        int len=1;
	        ListNode temp = new ListNode(0);
	        temp = head;
	        while(temp.next != null){
	            len++;
	            temp = temp.next;
	        }
	        
	        k = k % len;
	        System.out.println(k);
		    if(k == 0) return head;
		    ListNode newTail = head;
		    for(int i = 0; i < len - k - 1; i++) {
		        newTail = newTail.next;
		    }
		    
		    // Join two parts
		    ListNode newHead = newTail.next;
		    newTail.next = null;
		    temp.next = head;
		    
		    return newHead;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
