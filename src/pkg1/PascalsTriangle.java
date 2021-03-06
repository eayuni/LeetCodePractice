package pkg1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
 public static List<List<Integer>> generate(int numRows) {
	
	 List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		if(numRows <=0) {
			 return allrows;
		 }
		for(int i=0;i<numRows;i++)
		{
			row.add(0, 1);
			for(int j=1;j<row.size()-1;j++)
				row.set(j, row.get(j)+row.get(j+1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	 
	
	 
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(generate(5));
	}

}
