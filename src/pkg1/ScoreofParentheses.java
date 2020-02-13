package pkg1;

import java.util.Stack;

//856. Score of Parentheses
public class ScoreofParentheses {
	
	 public static int scoreOfParentheses(String S) {
	        if(S.length() == 0){
	            return 0;
	        }
	        
	        Stack<Integer> stack = new Stack<>();
	        stack.push(0);
	     
	        for(char c:  S.toCharArray()) {
	        	if(c == '(') {
	        		stack.push(0);
	        		System.out.println(stack);
	        	}
	        	else if(!stack.isEmpty() && c ==')') {
	        				 int v = stack.pop();
	        		         int w = stack.pop();
	        		        
	        		         stack.push(w + Math.max(2 * v, 1));
	        		       
	        				
	        			}
	        				        			
	        		}
	        		
	        return stack.pop();
	        }
			
	        
	        
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s ="(()(()))";
			System.out.println(scoreOfParentheses(s));
	}

}
