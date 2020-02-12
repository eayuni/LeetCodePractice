package pkg1;
//647. Palindromic Substrings
public class PalindromicSubstrings {
	static int count=0;
	public static int countSubstrings(String s) {
		
		if(s.isEmpty()) {
			return 0;
		}
		
		for(int i=0; i< s.length(); i++) {
			isPalindrome(s,i,i);
			 isPalindrome(s,i,i+1);
		}
		
		return count;
        
    }
	
	public static void isPalindrome(String s, int start,int end) {
	
		while(end < s.length() && start>=0 && (s.charAt(start) == s.charAt(end))){
			start--;
			end++;
			
			count++;
			
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaa";
		System.out.println(countSubstrings(s));
	}

}
