import java.util.Scanner;

public class Main {
	
	static int [][] graph;
	static int [][] visited;
	static int []alpha;
	static int M;
	static int N;
	static int maxCnt=0;
	static int v=0;
	
	public static void dfs(int i, int j) {
		visited[i][j] = 1;
		alpha[graph[i][j]] = 1;
		v++;
		maxCnt = maxCnt > v ? maxCnt : v;
		if(i+1<M && visited[i+1][j] == 0 && alpha[graph[i+1][j]]==0) {
			dfs(i+1 ,j);
		}
		if(i-1>=0 && visited[i-1][j]==0 && alpha[graph[i-1][j]]==0) {
			dfs(i-1, j);
		}
		if(j+1<N && visited[i][j+1]==0 && alpha[graph[i][j+1]]==0) {
			dfs(i, j+1);
		}
		if(j-1>=0 && visited[i][j-1]==0 && alpha[graph[i][j-1]]==0) {
			dfs(i,j-1);
		}
		v--;
		alpha[graph[i][j]] = 0;
		visited[i][j] = 0;
	}
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		M = scanner.nextInt();
		N = scanner.nextInt();
		graph = new int[M][N];
		visited = new int[M][N];
		alpha = new int[27];
		
		for(int i=0; i<M; i++) {
			String input = scanner.next();
			for(int j=0; j<N; j++)
				graph[i][j] = input.charAt(j)-64;
		}
		
		dfs(0,0);
		
		System.out.println(maxCnt);
		
	}
}