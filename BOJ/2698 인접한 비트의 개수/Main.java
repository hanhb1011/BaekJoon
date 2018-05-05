import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[][][] dp=new int[101][101][2];
		dp[0][1][1]=1;
		for(int i=2;i<=100;i++) {
			dp[0][i][0] = dp[0][i-1][0]+dp[0][i-1][1];
			dp[0][i][1] = dp[0][i-1][1]+dp[0][i-2][1];
		}
		for(int k=1;k<=100;k++) {
			for(int n=k;n<=100;n++) {
				dp[k][n][0] = dp[k][n-1][0]+dp[k][n-1][1];
				dp[k][n][1] = dp[k][n-1][0]+dp[k-1][n-1][1];
			}
		}
		while(T-->0) {
			int N=sc.nextInt(), K=sc.nextInt();
			System.out.println(dp[K][N][0]+dp[K][N][1]);
		}
	}
}