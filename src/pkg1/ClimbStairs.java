package pkg1;
//70. Climbing Stairs
public class ClimbStairs {
	
	public static int climbStairs(int n) {
		int [] mem = new int [n+1];
		if( n < 2) {
			
			return n;
		}
		
		mem[0]=1;
		mem[1]=1;
		
		for(int i=2; i<=n; i++) { 
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 2;
		
		System.out.println(climbStairs(a));
	}

}
