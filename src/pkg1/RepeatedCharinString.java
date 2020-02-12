package pkg1;

import java.util.HashMap;

public class RepeatedCharinString {
	
	public static int repeatedChar(String s) {
		if(s.isEmpty() || s.length() == 0) {
			return 0;
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char [] a = s.toCharArray();
		int count = 0;
		for(int i =0; i<a.length ;i++) {
			if(map.containsKey(s.charAt(i))) {
				count ++;
			}
			map.put(s.charAt(i), i);
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
