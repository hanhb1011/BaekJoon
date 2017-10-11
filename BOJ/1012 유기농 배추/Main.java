import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		class Loc {int x; int y; Loc(int y,int x){this.x = x; this.y = y;}}

		int T = scanner.nextInt();

		for(int t=0; t<T; t++) {
			int X = scanner.nextInt();
			int Y = scanner.nextInt();
			int K = scanner.nextInt();
			int [][]graph = new int[Y][X];
			ArrayDeque<Loc> queue = new ArrayDeque<>();
			for(int i=0; i<K; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt(); 
				graph[y][x] = 1;
				queue.add(new Loc(y,x));
			}
			int count = 0;
			while(!queue.isEmpty()) {
				Loc loc = queue.poll();

				if(graph[loc.y][loc.x]==-1)
					continue;
				else
					dfs(graph, loc.y, loc.x);
				count++;

			}
			System.out.println(count);
		}
	}

	private static void dfs(int[][] graph, int locY, int locX) {

		graph[locY][locX] = -1;
		//위
		for(int y=locY-1; y>=0; y--) {
			if(y>=0 && graph[y][locX]==1)
				dfs(graph, y, locX);
			else
				break;
		}
		//아래
		for(int y=locY+1; y<graph.length; y++) {
			if(y<graph.length && graph[y][locX]==1)
				dfs(graph, y, locX);
			else
				break;
		}
		//->
		for(int x=locX+1; x<graph[0].length; x++) {
			if(x<graph[0].length && graph[locY][x]==1)
				dfs(graph,locY,x);
			else
				break;
		}
		//<-
		for(int x=locX-1; x>=0; x--) {
			if(x>=0 && graph[locY][x]==1)
				dfs(graph,locY,x);
			else
				break;
		}


	}
}
