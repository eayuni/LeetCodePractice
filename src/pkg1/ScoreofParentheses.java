package pkg1;

import java.util.Stack;

//856. Score of Parentheses
public class ScoreofParentheses {
	
	 public static int scoreOfParentheses(String S) {
	        if(S.length() == 0){
	            return 0;
	        }
	        
	        Stack<Character> stack = new Stack<>();
	       int count =0;
	        for(char c:  S.toCharArray()) {
	        	
	        	if(c == '(') {
	        		stack.push(c);
	        	}
	        	else if(!stack.isEmpty() && c ==')') {
	        			if(stack.pop() == '(') {
	        				count ++;
	        			}
	        			
	        		}
	        		
	        	
	        }
			return count;
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s ="(()(()))";
			System.out.println(scoreOfParentheses(s));
	}

}
