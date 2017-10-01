import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		// c(n,r) = c(n-1,r)+c(n-1,r-1)
		int [][]dp = new int[N+1][N+1];
		dp[0][0] = 1;
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=i; j++){
				dp[i][j] = j==0 || j==i? 1 : (dp[i-1][j-1] + dp[i-1][j])%10007;
			}
		}
		System.out.println(dp[N][K]);
	}
}