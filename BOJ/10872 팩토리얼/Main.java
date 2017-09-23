import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long []dp = new long[13];
		dp[0] = 1; dp[1] = 1;
		for(int i=2; i<=N; i++)
			dp[i] = dp[i-1]*i;
		System.out.println(dp[N]);
		
	}
}


