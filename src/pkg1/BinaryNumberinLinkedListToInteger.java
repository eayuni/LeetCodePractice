package pkg1;

import java.util.Arrays;
import java.util.LinkedList;



//1290. Convert Binary Number in a Linked List to Integer

public class BinaryNumberinLinkedListToInteger {

	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
		public ListNode() {
			// TODO Auto-generated constructor stub
			
		}
		public void add(int i) {
			// TODO Auto-generated method stub
			this.val =i;
			
		}
	     
	    
	    
 }

public static int getDecimalValue(ListNode head) {
	        
	    	 int num =0;
	         
	         while(head!= null){
	             num <<= 1;
	 		num += head.val;
	 		head = head.next;
	 	    }
	 	    return num;
	         }
	        
	    
	
	    public static void main(String[] args) {
	// TODO Auto-generated method stub
	    	
	    	
	}
}
