package pkg1;

import java.util.Stack;

//1221. Split a String in Balanced Strings
public class SplitStringBalancedStrings {
	
	 public static int balancedStringSplit(String s) {
		 int bal=0;
         Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || stack.peek() == c)
            {
                stack.push(c);
            }
            else
                stack.pop();
            if(stack.isEmpty())
                bal++;
        }
    return bal;
       
        


       
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
	}

}
