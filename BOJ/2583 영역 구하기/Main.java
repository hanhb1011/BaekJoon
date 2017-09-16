import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static int[][] graph;
	static int squareCount = 0;
	static int Y, X;
	static int cnt;
	static int v;
	static PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	
	public static void setSquare(int y1, int x1, int y2, int x2) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++)
				graph[i][j] = 1;
		}
	}
	
	
	public static void dfs(int y, int x) {
		graph[y][x] = 2;
		cnt++;
		v++;
		
		if(x+1 <X && graph[y][x+1] == 0)
			dfs(y,x+1);
		if(x-1 >=0 && graph[y][x-1] == 0)
			dfs(y,x-1);
		if(y-1 >=0 && graph[y-1][x] == 0)
			dfs(y-1,x);
		if(y+1 <Y && graph[y+1][x] == 0)
			dfs(y+1,x);
		
		v--;
		if(v == 0) {
			pQueue.add(cnt);
			cnt = 0;
		}
	}
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Y = scanner.nextInt();
		X = scanner.nextInt();
		graph = new int[Y][X];
		int k = scanner.nextInt();
		
		for(int i=0; i<k; i++) {
			int [] nums = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
			setSquare(nums[1], nums[0], nums[3]-1, nums[2]-1);
		}

		for(int i=0; i<graph.length; i++)
			for(int j=0; j<graph[0].length; j++)
				if(graph[i][j] == 0)
					dfs(i,j);
		
		
		System.out.println(pQueue.size());
		while(!pQueue.isEmpty()) {
			System.out.print(pQueue.poll() + " ");
		}
		
	}
}