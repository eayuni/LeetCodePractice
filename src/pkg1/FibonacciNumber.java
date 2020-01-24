package pkg1;

//509. Fibonacci Number

public class FibonacciNumber {
	
	public static int fib(int N) {
		if(N ==0) {
			return 0;
		}
		if(N==1) {
			return 1;
		}
		int [] memo = new int[N+1];
		memo[0]=0;
		memo[1]=1;
		
		for(int i=2; i<=N; i++) {
			memo[i]= memo[i-1] + memo[i-2];
		}
			
		return memo[N];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 4;
		
		System.out.println(fib(a));

	}

}
