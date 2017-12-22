import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [][] graph = new int[N][N];
		int min = Integer.MAX_VALUE, result = 0;
		for(int i=0; i<M; i++) {
			int [] in = {scanner.nextInt()-1, scanner.nextInt()-1};
			graph[in[0]][in[1]]=1;
			graph[in[1]][in[0]]=1;
		}
		
		for(int i=0; i<N; i++) {
			Queue<Integer> queue = new ArrayDeque<>();
			queue.add(i);
			int []dist = new int[N];
			Arrays.fill(dist, Integer.MAX_VALUE);
			dist[i] = 0;
			int []visited = new int[N];
			
			while(!queue.isEmpty()) {
				int n = queue.poll();
				visited[n] = 1;
				for(int j=0; j<N; j++) {
					if(graph[n][j] == 1 && visited[j] == 0) {
						queue.add(j);
						dist[j] = dist[j] < dist[n]+1 ? dist[j] : dist[n]+1;
					}
				}
			}
			int score = 0;
			for(int j=0; j<N; j++)
				score+=dist[j];
			if(score !=0 && score < min) {
				min = score;
				result = i;
			}	
		}
		
		System.out.println(result+1);
	}	
}

