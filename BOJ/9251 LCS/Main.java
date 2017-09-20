import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		final String str1 = scanner.next();
		final String str2 = scanner.next();
		int [][]dp = new int[str2.length()][str1.length()];

		for(int i=0; i<str1.length(); i++) {
			dp[0][i] = str1.charAt(i) == str2.charAt(0) ? 1 : i-1>=0 ? dp[0][i-1] : 0;
		}
		for(int i=0; i<str2.length(); i++) {
			dp[i][0] = str1.charAt(0) == str2.charAt(i) ? 1 : i-1>=0 ? dp[i-1][0] : 0;
		}
		
		for(int i=1; i<str2.length(); i++) {
			for(int j=1; j<str1.length(); j++) {
				dp[i][j] = str1.charAt(j) == str2.charAt(i) ? 
						Math.max(dp[i-1][j-1]+1, Math.max(dp[i-1][j], dp[i][j-1]))
						: Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
			}
		}
		System.out.println(dp[str2.length()-1][str1.length()-1]);

	}
}