import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] graph;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		class Loc{ int y; int x; Loc(int y, int x){this.y = y; this.x = x;}}
		
		for(int t = 0; t < T ; t++) {
			int L = scanner.nextInt();
			graph = new int[L][L];
			Loc src = new Loc(scanner.nextInt(), scanner.nextInt());
			Loc dst = new Loc(scanner.nextInt(), scanner.nextInt());
			Queue<Loc> queue = new ArrayDeque<>();
			queue.add(src);
			
			while(!queue.isEmpty()) {
				Loc loc = queue.poll();
				int y = loc.y;
				int x = loc.x;
				if(x == dst.x && y == dst.y) {
					System.out.println(graph[y][x]);
					break;
				}
				if(y-2 >= 0 && x+1 < L && graph[y-2][x+1]==0) {
					graph[y-2][x+1]=graph[y][x]+1;
					queue.add(new Loc(y-2, x+1));
				}
				if(y-1 >= 0 && x+2 < L && graph[y-1][x+2]==0) {
					graph[y-1][x+2]=graph[y][x]+1;
					queue.add(new Loc(y-1,x+2));
				}
				if(y+1 < L && x+2 < L && graph[y+1][x+2]==0) {
					graph[y+1][x+2]=graph[y][x]+1;
					queue.add(new Loc(y+1,x+2));
				}
				if(y+2 < L && x+1 < L && graph[y+2][x+1]==0) {
					graph[y+2][x+1]=graph[y][x]+1;
					queue.add(new Loc(y+2,x+1));
				}
				if(y+2 < L && x-1 >= 0 && graph[y+2][x-1]==0) {
					graph[y+2][x-1]=graph[y][x]+1;
					queue.add(new Loc(y+2,x-1));
				}
				if(y+1 < L && x-2 >=0 && graph[y+1][x-2]==0) {
					graph[y+1][x-2]=graph[y][x]+1;
					queue.add(new Loc(y+1,x-2));
				}
				if(y-1 >=0 && x-2 >=0 && graph[y-1][x-2]==0) {
					graph[y-1][x-2]=graph[y][x]+1;
					queue.add(new Loc(y-1,x-2));
				}
				if(y-2 >=0 && x-1 >=0 && graph[y-2][x-1]==0) {
					graph[y-2][x-1]=graph[y][x]+1;
					queue.add(new Loc(y-2,x-1));
				}
			}
		}
	}
}




