import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		class Loc implements Comparable<Loc>{
			int v,w; 
			Loc(int vv, int ww){v=vv;w=ww;}
			@Override
			public int compareTo(Loc o) {
				if(w>o.w) return 1;
				else if(w==o.w) return 0;
				return -1;}
		}
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [][]graph = new int[N][N];
		for(int i=0; i<N; i++)
			Arrays.fill(graph[i], 1000000);
		int []cost = new int[N];
		Arrays.fill(cost, Integer.MAX_VALUE);
		for(int i=0; i<M; i++) {
			int u = scanner.nextInt()-1;
			int v = scanner.nextInt()-1;
			int w = scanner.nextInt();
			graph[u][v] = graph[u][v] < w ? graph[u][v] : w;
			
		}
		int A = scanner.nextInt()-1;
		int B = scanner.nextInt()-1;

		PriorityQueue<Loc> pq = new PriorityQueue<>();
		cost[A] = 0;
		pq.add(new Loc(A, 0));
		
		while(!pq.isEmpty()) {
			Loc loc = pq.poll();
			int v = loc.v;
			if(loc.w > cost[v])
				continue;
			
			for(int i=0; i<N; i++)
				if(graph[v][i]!=1000000) {
					if(cost[v]+graph[v][i] < cost[i]) {
						pq.add(new Loc(i, graph[v][i]));
						cost[i] = cost[v]+graph[v][i];
					}
				}
		}
		
		System.out.println(cost[B]);
	}
}

