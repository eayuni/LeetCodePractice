package pkg1;

import java.util.Arrays;

//344. Reverse String

public class ReverseString {
	public static String[] reverseString(String[] a) {
        int n = a.length-1;
        int i=0;
        
       while(i<n) {
    	   String temp = a[i];
    	   a[i]=a[n];
    	   a[n]=temp;
    	   i++;
    	   n--;
       }
		return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = new String[]{"h","e","l","l","o"};
		System.out.print(Arrays.toString(reverseString(a)));
		
		
	}

}
