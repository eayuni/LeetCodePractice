package pkg1;

import java.util.HashMap;
import java.util.Set;

public class RepeatedCharinString {
	
	public static int repeatedChar(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(s.isEmpty() || s.length() == 0) {
			return 0;
		}
		
		char [] a = s.toCharArray();
		int count = 0;
		
		for(int i =0; i<a.length ;i++) {
			if(map.containsKey(s.charAt(i))) {
				int k =map.get(s.charAt(i))+ 1;
				System.out.println(k);
				
				map.put(s.charAt(i), k);
				System.out.println(k);
				System.out.println(map);
				
			}
			map.put(s.charAt(i), count);
			//System.out.println(map);
		}
		int max= 0;
		for(int i=0; i< map.size();i++) {
			int k =map.get(s.charAt(i));
			
			
			System.out.println(k);
			System.out.println(max);
			max= Math.max(max, k);
		}
		
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="aaa";
			System.out.println(repeatedChar(s));
	}

}
