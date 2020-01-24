package pkg1;

import java.util.HashMap;
import java.util.Set;

//Print All Distinct Elements of a given integer array

public class DistinctElementsInArray {
	public static Set<Integer> distinctElement(int [] arr) {
		
		if(arr.length == 0) {
			return null;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i<arr.length; i++) {
			map.put(arr[i], i);
			System.out.println(map);
		}
		System.out.println(map);
		
		return map.keySet();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int [] arr = new int [] {1,2,2,1,1,3};
		//int [] arr = new int [] {1,2};
		//int [] arr = new int [] {};
		
		System.out.println(distinctElement(arr));
		
	}

}
