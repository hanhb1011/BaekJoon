import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int[][] graph;
	static int N, cnt, v;
	static PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	
	
	public static void dfs(int y, int x) {
		graph[y][x] = 2;
		cnt++;
		v++;
		
		if(x+1 <N && graph[y][x+1] == 1)
			dfs(y,x+1);
		if(x-1 >=0 && graph[y][x-1] == 1)
			dfs(y,x-1);
		if(y-1 >=0 && graph[y-1][x] == 1)
			dfs(y-1,x);
		if(y+1 <N && graph[y+1][x] == 1)
			dfs(y+1,x);
		
		v--;
		if(v == 0) {
			pQueue.add(cnt);
			cnt = 0;
		}
	}
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		graph = new int[N][N];
		for(int i=0; i<N; i++) {
			String str = scanner.next();
			for(int j=0; j<N; j++)
				graph[i][j] = str.charAt(j)-48;
		}
		
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				if(graph[i][j] == 1)
					dfs(i,j);
		
		System.out.println(pQueue.size());
		while(!pQueue.isEmpty()) {
			System.out.println(pQueue.poll());
		}
		
	}
}