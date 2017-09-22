import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int [][] dp = new int[N][10]; //오르막 수 저장, 두 번째 차원은 일의 자릿수에 해당하는 오르막 수의 갯수임.
		
		//initialize
		for(int i=0; i<10; i++)
			dp[0][i]++;
		
		//dp
		for(int i=1; i<N; i++) {
			for(int j=0; j<10; j++){
				dp[i][j] =(dp[i][j]+dp[i-1][j])%10007;
				for(int k=j+1; k<10; k++)
					dp[i][k] = (dp[i][k] + dp[i-1][j])%10007;
			}
		}
		
		//result
		int sum=0;
		for(int i=0; i<10; i++)
			sum=(sum+dp[N-1][i])%10007;
		System.out.println(sum);
		
	}
}
