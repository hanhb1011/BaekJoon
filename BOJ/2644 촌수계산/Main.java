import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int N = scanner.nextInt();
		int [][]graph = new int[N][N];
		int X = scanner.nextInt()-1, Y = scanner.nextInt()-1;
		int M = scanner.nextInt();
		for(int i=0; i<M; i++){
			int [] in = {scanner.nextInt()-1, scanner.nextInt()-1};
			graph[in[0]][in[1]] = 1;
			graph[in[1]][in[0]] = 1;
		}
		
		Queue<Integer> queue = new ArrayDeque<>();
		int []dist = new int[N];
		int []visited = new int[N];
		queue.add(X);
		while(!queue.isEmpty()) {
			int v = queue.poll();
			visited[v] = 1;
			for(int i=0; i<N; i++)
				if(visited[i]==0 && graph[v][i]==1) {
					dist[i] = dist[v]+1;
					queue.add(i);
				}
		}
		System.out.println(dist[Y] == 0 ? -1 : dist[Y]);
	}
}

