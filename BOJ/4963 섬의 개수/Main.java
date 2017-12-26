import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Loc{int y,x; Loc(int y, int x){this.y=y; this.x=x;}}
public class Main {
	static int [][]dir = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,-1},{-1,1}};
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int M = scanner.nextInt(), N = scanner.nextInt(), result = 0;
			if(M==0 && N==0)
				break;
			int [][]graph = new int[N][M];
			Queue<Loc> queue = new ArrayDeque<>();
			
			for(int i=0; i<N; i++)
				for(int j=0; j<M; j++) {
					graph[i][j] = scanner.nextInt();
					if(graph[i][j]==1)
						queue.add(new Loc(i,j));
				}
			
			while(!queue.isEmpty()) {
				Loc l = queue.poll();
				if(graph[l.y][l.x]==1) {
					result++;
					dfs(graph, l.y, l.x, M, N);
				}
			}
			System.out.println(result);
		}
	}

	private static void dfs(int[][] graph, int y, int x, int M, int N) {
		graph[y][x] = 2;
		for(int i=0; i<8; i++)
			if(y+dir[i][0]>=0 && y+dir[i][0]<N && x+dir[i][1]>=0 && x+dir[i][1]<M
					&& graph[y+dir[i][0]][x+dir[i][1]]==1)
				dfs(graph, y+dir[i][0], x+dir[i][1], M, N);
	}

}

