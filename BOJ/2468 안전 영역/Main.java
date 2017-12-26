import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Loc{int y,x; Loc(int y, int x){this.y=y; this.x=x;}}
public class Main {
	
	static int result = 0;
	static int N;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		int [][]GRAPH = new int[N][N];
		
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				GRAPH[i][j] = scanner.nextInt();
		
		for(int h=0; h<=100; h++) {
			Queue<Loc> queue = new ArrayDeque<>();
			int count = 0;
			int [][]graph = new int[N][N]; //복사본
			
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++) {
					graph[i][j] = GRAPH[i][j];
					if(graph[i][j]>h)
						queue.add(new Loc(i,j));
				}
			
			while(!queue.isEmpty()) {
				Loc l = queue.poll();
				if(graph[l.y][l.x]!=-1) {
					count++;
					dfs(l.y, l.x, graph, h);
				}
			}
			result = result > count ? result : count;
		}
		System.out.println(result);
	}
	
	public static void dfs(int y, int x, int[][] graph, int h) {
		graph[y][x] = -1;
		for(int i=0; i<4; i++)
			if(y+dir[i][0]>=0 && y+dir[i][0]<N && x+dir[i][1]>=0 && x+dir[i][1]<N
			&& graph[y+dir[i][0]][x+dir[i][1]] > h)
				dfs(y+dir[i][0], x+dir[i][1], graph, h);
	}
	
}

