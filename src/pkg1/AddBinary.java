package pkg1;

import java.util.Arrays;

//67. Add Binary

public class AddBinary {
	
	 public static String addBinary(String a, String b) {
		 
		 if(a.isEmpty() || a == null) {
			 return b;
		 }
		 if(b.isEmpty() || b == null) {
			 return a;
		 }
		 
		 
		 
		return b;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b ="1";
		System.out.println(addBinary(a,b));
	}

}
