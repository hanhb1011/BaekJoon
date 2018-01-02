import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		int N = scanner.nextInt();
		int [][]dp = new int[320][N+1];

		for(int i=1; i<320; i++) {
			int sqNum = i*i;
			if(sqNum > N) {
				System.out.println(dp[i-1][N]);
				break;
			}
			dp[i][sqNum] = 1;
			if(i==1)
				for(int j=1; j<=N; j++)
					dp[i][j] = dp[i][j-1]+1;
			else
				for(int j=1; j<=N; j++)
					if(j-sqNum>=0)
						dp[i][j] = dp[i-1][j] < dp[i][j-sqNum]+1 ? dp[i-1][j] : dp[i][j-sqNum]+1;
					else
						dp[i][j] = dp[i-1][j];
		}
	}
}

