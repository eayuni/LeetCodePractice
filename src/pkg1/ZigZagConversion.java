package pkg1;
//6. ZigZag Conversion
public class ZigZagConversion {
	
	public static String convert(String s, int numRows) {
		
		if(numRows==1) return s;
	    int x = 2 * (numRows-1); // distance between pipes |/|/|...
	    int len = s.length();
	    char[] c = new char[len];
	    int k =0;
	    for(int i=0; i < numRows; i++)
	    {
	        for(int j=i;j<len;j=j+x)
	        {
	            c[k++] = s.charAt(j);
	            if(i>0 && i<numRows-1 && j+x-2*i < len)
	            {
	                   c[k++] = s.charAt(j+x-2*i); // extra character between pipes
	            }
	        }
	    }
	    return new String(c);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		String s ="PAYPALISHIRING";
		
		System.out.println(convert(s,n));
	}

}
