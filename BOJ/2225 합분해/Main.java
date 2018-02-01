import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int [][]dp = new int[K+1][N+1];
		Arrays.fill(dp[1], 1);
		
		for(int k=2; k<=K; k++)
			for(int n=0; n<=N; n++)
				dp[k][n]= n==0?1:(dp[k-1][n]+dp[k][n-1])%1000000000;
		
		System.out.println(dp[K][N]);
	}
}