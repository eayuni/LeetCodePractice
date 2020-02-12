package pkg1;

import java.util.ArrayList;
import java.util.List;

//22. Generate Parentheses
public class GenerateParentheses {
	
	public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if(n == 0){
            return result;
        }
        String s = "";
        
        backtrack(result,s, 0,0,n);
    
		return result;
    }
	
	public static void backtrack(List<String> result, String s, int left, int right, int n) {
		if(s.length()== n*2) {
			result.add(s);
		}
		
		if(left < n) {
			backtrack(result, s+"(", left+1, right,n);
		}
		if(left>right) {
			backtrack(result, s+")", left, right+1,n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		System.out.println(generateParenthesis(n));
	}

}
