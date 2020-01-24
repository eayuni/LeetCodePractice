package pkg1;
//125. Valid Palindrome

public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		
		if(s.isEmpty()) {
			return true;
		}
	
		String S=s.replaceAll("\\W", "").toLowerCase();
		String revS = "";
		
		char[] ch = S.toCharArray();
		
		for(int i = S.length()-1; i>=0;i--) {
			revS= revS+ch[i];
			
		}
		
		System.out.println(S);	
		System.out.println(revS);	
	
	return (S.equals(revS));
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "A man, a plan, a canal: Panama";
		String s = "A man, a plan.";
		System.out.println(isPalindrome(s));
	}

}
