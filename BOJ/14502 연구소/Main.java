import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

class Loc{int x,y; Loc(int yy,int xx){x=xx; y=yy;}}

public class Main {

	static int Y, X, virsIdx=0;
	static int[][] graph;
	static Loc[] virs = new Loc[64];
	static int result = 0;
	static int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}}; 

	public static void search(Loc[] walls, int idx, int y, int x) {
		if(idx == 3) {
			//copy
			int [][] simul = new int[Y][X];
			for(int i=0; i<Y; i++)
				for(int j=0; j<X; j++)
					simul[i][j] = graph[i][j];
			//update walls
			for(int i=0; i<idx; i++)
				simul[walls[i].y][walls[i].x] = 1;

			//simulate
			simulate(simul);
			return;
		}

		for(int i=y; i<Y; i++) {
			for(int j=i==y ? x+1 : 0; j<X; j++) {
				if(graph[i][j] == 0) {
					walls[idx] = new Loc(i,j);
					search(walls, idx+1, i, j);
				}
			}
		}
	}

	public static void simulate(int [][] simul) {
		Queue<Loc> queue = new ArrayDeque<>();

		for(int i=0; i<virsIdx; i++)
			queue.add(virs[i]);
		while(!queue.isEmpty()) {
			Loc loc = queue.poll();
			for(int i=0; i<4; i++) {
				if(loc.y+dir[i][0] >=0 && loc.y+dir[i][0] <Y && loc.x + dir[i][1] >=0 && loc.x + dir[i][1] < X
				&& simul[loc.y+dir[i][0]][loc.x + dir[i][1]] == 0) {
					simul[loc.y+dir[i][0]][loc.x + dir[i][1]] = 2;
					queue.add(new Loc(loc.y+dir[i][0], loc.x + dir[i][1]));
				}
			}
		}
		
		int count = 0;
		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++)
				if(simul[i][j]==0)
					count++;
		result = count > result ? count : result;
		
	}

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Y = scanner.nextInt();
		X = scanner.nextInt();
		graph = new int[Y][X];

		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++) {
				int w = scanner.nextInt();
				graph[i][j] = w;
				if(w==2)
					virs[virsIdx++] = new Loc(i,j); //바이러스의 위치를 기억
			}

		/*
		 * 완전탐색으로 벽을 세운 뒤 최적의 경우를 구함. 
		 * 벽 3개를 세우면 -> dfs로 바이러스를 퍼트리고 0의 수 세기
		 */
		for(int i=0; i<Y; i++) {
			for(int j=0; j<X; j++)
				if(graph[i][j] == 0) {
					Loc []walls = new Loc[3];
					walls[0] = new Loc(i,j);
					search(walls, 1, i, j);
				}
		}

		System.out.println(result);
	}
}
