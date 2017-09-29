import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //동전 종류
		int K = scanner.nextInt(); //총합
		int []dp = new int[K+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		int [] coin = new int[N];
		for(int i=0; i<N; i++)
			coin[i] = scanner.nextInt();
		Arrays.sort(coin);
		
		//initialize
		dp[0] = 0;
		//dp
		for(int i=0; i<N; i++) {
			for(int j=1; j<=K; j++) {
				if(i==0) {
					dp[j] = j%coin[0] == 0 ? j/coin[0] : Integer.MAX_VALUE;
				} else {
					
					dp[j] = Math.min(dp[j] ,Math.min(j-coin[i]>=0 && dp[j-coin[i]]!=Integer.MAX_VALUE ? dp[j-coin[i]] + 1 : dp[j], dp[j%coin[i]] != Integer.MAX_VALUE ?  j/coin[i] + dp[j%coin[i]] : dp[j]));
					//첫 번째 : dp[j]
					//두 번째 : j-coin>=0 && dp[j-coin[i]]!=Integer.MAX_VALUE ? dp[j-coin[i]] + 1 : dp[j]
					//세 번째 : dp[j%coin[i]] != Integer.MAX_VALUE ?  j/coin[i] + dp[j%coin[i]] : dp[j]
				}
			}
		}
		System.out.println(dp[K] == Integer.MAX_VALUE ? -1 : dp[K]);
		
	}


}


