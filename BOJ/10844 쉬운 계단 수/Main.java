import java.util.Scanner;

public class Main {
	
	
	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		
		int [][]dp = new int[100][10];
		for(int i=1; i<=9; i++)
			dp[0][i]++;
		
		for(int i=1; i<N; i++) {
			
			for(int j=0; j<=9; j++) {
				if(j==0)
					dp[i][0] = dp[i-1][1];
				else if(j==9)
					dp[i][9] = dp[i-1][8];
				else {
					dp[i][j] = (dp[i-1][j+1]+dp[i-1][j-1])%1000000000;
				}
				
			}
			
		}
		int sum=0;
		for(int i=0; i<=9; i++)
			sum= (sum+dp[N-1][i])%1000000000;

		System.out.println(sum);
	}
}