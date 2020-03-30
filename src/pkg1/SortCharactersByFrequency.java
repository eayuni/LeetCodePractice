package pkg1;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
	
	public static String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        
        if(s.isEmpty() || s.length() == 0) {
        	return result.toString();
        }
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray()) {
        	map.put(c, (map.getOrDefault(c, 0)+1));
        }
        System.out.println(map);
        
        PriorityQueue<Character> minHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        minHeap.addAll(map.keySet());
        
        System.out.println(minHeap);
        while(!minHeap.isEmpty()) {
        	char c = minHeap.poll();
            for(int i = 0; i < map.get(c); i++){
               result.append(c);
            }
        	
        }
        return result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  ="tree";
		
		System.out.println(frequencySort(s));
	}

}
