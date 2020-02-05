package pkg1;



//5. Longest Palindromic Substring
	public class LongestPalindromicSubstring {
		public static String longestPalindrome(String s) {
			
			if(s.length() <=1|| s==null) {
				return s;
			}
			int start=0;
			int end=0;
			
			for(int i=0; i < s.length();i++) {
				int len1 = isPalindrome(s,i,i);
				int len2 = isPalindrome(s,i,i+1);
				
				int len = Math.max(len1, len2);
		
				
				if(len > (end - start)) {
					start = i - (len-1)/2;
					end = i + (len/2);
					
				}
				
			}
			
		
			return s.substring(start, end+1);
		}
		
		public static int isPalindrome(String s, int start, int end) {
			if(s.length()==0 || s == null || start>end) {
				return 0;
			}
			
			while(end < s.length() && start>=0 && (s.charAt(start) == s.charAt(end))){
				start--;
				end++;
			}
			return end-start-1;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="ac";
		System.out.println(longestPalindrome(s));

	}

}
