package pkg1;

import java.util.HashSet;
import java.util.Set;

//3. Longest Substring Without Repeating Characters
public class LongestSubstring {
	 public static int lengthOfLongestSubstring(String s) {
	       int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
