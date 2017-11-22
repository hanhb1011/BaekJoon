import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); //정점
		int M = scanner.nextInt(); //간선
		int [] visited = new int[N];
		int [][] graph = new int[N][N];
		int result = 0;
		
		for(int i=0; i<M; i++) {
			int u = scanner.nextInt()-1, v = scanner.nextInt()-1;
			graph[u][v] = 1;
			graph[v][u] = 1;
		}
		for(int i=0; i<N; i++)
			if(visited[i] == 0) {
				result++;
				dfs(i, graph, visited, N);
			}
		System.out.println(result);
	}

	private static void dfs(int v, int[][] graph, int[] visited, int N) {
		visited[v] = 1;
		for(int i=0; i<N; i++)
			if(graph[v][i] == 1 && visited[i] == 0)
				dfs(i, graph, visited, N);
	}


}

