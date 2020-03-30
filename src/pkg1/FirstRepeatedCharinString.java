package pkg1;

import java.util.HashMap;
import java.util.PriorityQueue;


public class FirstRepeatedCharinString {
	
	@SuppressWarnings("null")
	public static char repeatedChar(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(s.isEmpty() || s.length() == 0) {
			return (Character) null;
		}
		
		for(char c: s.toCharArray()) {
        	map.put(c, (map.getOrDefault(c, 0)+1));
        }
		System.out.println(map);
		
		for(char c:s.toCharArray()) {
			if(map.get(c) > 1) {
				return c;
			}
		}
		
		 
	  
		return (Character) null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="abcdabe";
			System.out.println(repeatedChar(s));
	}

}
