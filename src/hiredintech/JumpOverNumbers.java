package hiredintech;
import java.util.ArrayList;
import java.util.List;

public class JumpOverNumbers {
	public static int jump_over_numbers(List<Integer> list) {
        // Write your code here
        int count =0;
        int i=0;
        while(i<list.size()){
        	if(list.get(i)== 0) {
        		return -1;
        	}
           i += list.get(i);
           count++;
                   
          }
        return count;
                
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>(){{ 
            add(3); 
            add(4);
            add(1); 
            add(2); 
            add(5); 
            add(6); 
            add(9); 
            add(0); 
            add(1); 
            add(2); 
            add(3); 
            add(1); 
            } };
            System.out.println("ArrayList : " + ls.toString()); 
            System.out.println(jump_over_numbers(ls)); 
		
	}

}
