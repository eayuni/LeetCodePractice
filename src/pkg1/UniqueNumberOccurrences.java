package pkg1;

import java.util.HashMap;
import java.util.HashSet;

//1207. Unique Number of Occurrences

public class UniqueNumberOccurrences {
	
	  public static boolean uniqueOccurrences(int[] arr) {
		  
		  HashMap<Integer, Integer> hsmap = new HashMap<>();
		  
		  for(int n : arr) {
			  hsmap.put(n, hsmap.getOrDefault(n, 0)+1);
			  
		  }
		  
		  HashSet<Integer> hset = new HashSet<>(hsmap.values());
		  
		 return hsmap.size() == hset.size();
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = new int [] {1,2,2,1,1,3};
		int [] arr = new int [] {1,2};
		
		System.out.println(uniqueOccurrences(arr));
		

	}

}
