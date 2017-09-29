import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); 
		int []tri = new int[121]; tri[1] = 1;
		int []coin = new int[121]; coin[1] = tri[1];//coin은 1 to 121로 제한한다. 사면체의 30만을 넘지 않는 최대가 295240이기 떄문.
		int []dp = new int[N+1];
		int maxIndex; //코인의 최댓값 인덱스 정의
		for(maxIndex=2; maxIndex<121; maxIndex++) {
			tri[maxIndex] = tri[maxIndex-1]+maxIndex;
			coin[maxIndex] =coin[maxIndex-1]+tri[maxIndex];
			if(coin[maxIndex] > N) {
				break;
			}
		}
		
		//initialize
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		//dp, 1660 캡틴 이다솜은 동전 2와 동치인 문제.
		for(int i=1; i<maxIndex; i++) {
			for(int j=1; j<=N; j++) {
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
		System.out.println(dp[N] == Integer.MAX_VALUE ? -1 : dp[N]);
		
	}


}


