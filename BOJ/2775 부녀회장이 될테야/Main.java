import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int t=0; t<T; t++) {
			int K = scanner.nextInt(); //층
			int N = scanner.nextInt(); //호
			int [][]dp = new int[K+1][N+1];
			
			for(int i=0; i<=K; i++) {
				for(int j=1; j<=N; j++) {
					if(i==0) //0층일 경우
						dp[0][j] = j;
					else
						dp[i][j] = j == 0 ? dp[i-1][j] : dp[i][j-1]+dp[i-1][j];  
				}
			}
			
			System.out.println(dp[K][N]);
		}
		
	}
}