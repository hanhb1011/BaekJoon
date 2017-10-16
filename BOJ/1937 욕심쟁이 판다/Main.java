import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [][]graph = new int[N][N];
		int [][]dp = new int[N][N]; //카운팅 저장
		int [][]dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		int result = 0;
		
		class Loc implements Comparable<Loc>{int y; int x; int w; Loc(int yy, int xx, int ww) {y=yy;x=xx;w=ww;}
			public int compareTo(Loc o) {if(w > o.w) return 1; else if(w==o.w) return 0; else return -1;}}
		PriorityQueue<Loc> queue = new PriorityQueue<>(10000);
		
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++) {
				graph[i][j] = scanner.nextInt();
				queue.add(new Loc(i,j,graph[i][j]));
			}

		while(!queue.isEmpty()) {
			Loc loc = queue.poll();
			int y = loc.y;
			int x = loc.x;
			for(int i=0; i<4; i++) {
				if(y+dir[i][0] <N && y+dir[i][0] >=0 && x+dir[i][1] <N && x+dir[i][1]>=0 && graph[y+dir[i][0]][x+dir[i][1]] > graph[y][x]) {
					dp[y+dir[i][0]][x+dir[i][1]] = dp[y+dir[i][0]][x+dir[i][1]] > dp[y][x]+1 ? dp[y+dir[i][0]][x+dir[i][1]] : dp[y][x]+1;
					result = result > dp[y+dir[i][0]][x+dir[i][1]] ? result : dp[y+dir[i][0]][x+dir[i][1]];
				}
			}
		}
		System.out.println(result+1);
	}
}
