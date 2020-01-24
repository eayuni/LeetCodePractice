package pkg1;

public class MinStack {
	 /** initialize your data structure here. */
	 private class Node {
	        private Node(int val, int min) {
	            this(val, min, null);
	        }
	        
	        private Node(int val, int min, Node next) {
	        }
	    }
    public Node() 
    {
        
    }
    
    public void push(int x) {
           
		if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }
        
    
    
    public void pop() {
        head= head.next;
        
    }
    
    public int top() {
        
        return head.val;
        
    }
    
     
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


