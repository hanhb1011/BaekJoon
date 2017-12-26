import java.util.Scanner;

public class Main {

	static int result = 0;
	static int [][] dir = {{1,1},{0,1},{1,0}};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int minW = N < M ? N : M;
		int [][]graph= new int [N][M];
		for(int i=0; i<N; i++) {
			String in = scanner.next();
			for(int j=0; j<M; j++) {
				graph[i][j] = in.charAt(j) == '1'? 1:0;
				result = result > graph[i][j] ? result : graph[i][j];
			}
		}
		for(int w=2; w<=minW; w++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(graph[i][j]==w-1) {
						boolean sq = true;
						for(int k=0; k<3; k++)
							if(i+dir[k][0]>=N || j+dir[k][1]>=M || graph[i+dir[k][0]][j+dir[k][1]]!=w-1) {
								sq = false;
								break;
							}
						if(sq) {
							result = w*w;
							graph[i][j] = w;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}

