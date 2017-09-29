import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //동전 종류
		int K = scanner.nextInt(); //총합
		int [][]dp = new int[N][K+1];
		int [] coin = new int[N];
		for(int i=0; i<N; i++)
			coin[i] = scanner.nextInt();

		/* 동전 1 DP
		 * 1. 동전 갯수를 1부터 N개까지 점점 늘려가며 사용
		 * 2. dp[i][j] = dp[i-1][j] + dp[i][j-coin[i]]
		 *    즉, 지금까지 쓴 동전 (0번째 동전부터, i-1번째 동전까지)의 경우의 수와 
		 *    + 현재 금액에서 현재 동전의 값을 뺀 값을 더한다.
		 */
		
		//initialize : 0원의 경우의 count는 1이다.
		for(int i=0; i<N; i++)
			dp[i][0] = 1;
		
		for(int i=0; i<N; i++) {
			for(int j=1; j<=K; j++) {
				if(i==0) { //첫 번째 동전일 경우
					dp[i][j] = j%coin[i]==0 ? 1 : 0; 
				} else { 
					dp[i][j] = j-coin[i]>=0? dp[i-1][j] + dp[i][j-coin[i]] : dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[N-1][K]);
	}


}


