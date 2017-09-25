import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for(int t = 0; t<T; t++){
			//input
			int N = scanner.nextInt();
			int [][] graph = new int[2][N];
			int [][] dp = new int[2][N];

			for(int i=0; i<2; i++)
				for(int j=0; j<N; j++)
					graph[i][j] = scanner.nextInt();

			//initailize
			dp[0][0] = graph[0][0];
			dp[1][0] = graph[1][0];

			for(int i=1; i<2; i++)
				for(int j=1; j<N; j++){
					if(j-2 >=0){
						dp[0][j] = Math.max(Math.max(dp[0][j-2], dp[1][j-2]), dp[1][j-1]) + graph[0][j];
						dp[1][j] = Math.max(Math.max(dp[0][j-2], dp[1][j-2]), dp[0][j-1]) + graph[1][j];
					} else {
						dp[0][j] = dp[1][j-1] + graph[0][j];
						dp[1][j] = dp[0][j-1] + graph[1][j];

					}
				}
			System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));
		}


	}

}


