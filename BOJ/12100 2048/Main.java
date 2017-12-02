import java.util.Scanner;

public class Main {

	static int[][][] graph;
	static int N;
	static int Max = 0;
	static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		graph = new int[N][N][2];
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				graph[i][j][0] = scanner.nextInt();

		for(int i=0; i<4; i++)
			recur(i, 0, graph);
		
		System.out.println(Max);
	}

	public static void recur(int d, int count, int [][][]graph) {
		if(count == 5) {
			//카운팅하고 맥스 갱신
			int max = 0;
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++)
					max = max > graph[i][j][0] ? max : graph[i][j][0];
			
			Max  = Max > max ? Max : max;
			return;
		}
		
		int[][][] newGraph = new int[N][N][2];

		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				newGraph[i][j][0] = graph[i][j][0];

		if(d == 0) {
			
			for(int i=0; i<N; i++) {
				for(int j=N-1; j>=0; j--) {
					if(newGraph[i][j][0]==0)
						continue;
					int c = j;
					while(c+1 <N && newGraph[i][c+1][0]==0) 
						c++;
					if(c!=j) {
						newGraph[i][c][0] = newGraph[i][j][0];
						newGraph[i][j][0] = 0;
					}
					
					if(i+dir[d][0] >=0 && i+dir[d][0] <N && c+dir[d][1] >=0 && c+dir[d][1] <N
							&& newGraph[i][c][0] == newGraph[i+dir[d][0]][c+dir[d][1]][0] &&  newGraph[i+dir[d][0]][c+dir[d][1]][1]==0) {
						newGraph[i+dir[d][0]][c+dir[d][1]][0] += newGraph[i][c][0];
						newGraph[i+dir[d][0]][c+dir[d][1]][1] = 1;
						newGraph[i][c][0] = 0;
					}
				}
			}

		} else if(d == 1) { //밑
				
			for(int j=0; j<N; j++) {
				for(int i=N-1; i>=0; i--) {
					if(newGraph[i][j][0]==0)
						continue;
					int c = i;
					while(c+1 <N && newGraph[c+1][j][0]==0) 
						c++;
					if(c!=i) {
						newGraph[c][j][0] = newGraph[i][j][0];
						newGraph[i][j][0] = 0;
					}
					
					if(c+dir[d][0] >=0 && c+dir[d][0] <N && j+dir[d][1] >=0 && j+dir[d][1] <N
							&& newGraph[c][j][0] == newGraph[c+dir[d][0]][j+dir[d][1]][0] &&  newGraph[c+dir[d][0]][j+dir[d][1]][1]==0) {
						newGraph[c+dir[d][0]][j+dir[d][1]][0] += newGraph[c][j][0];
						newGraph[c+dir[d][0]][j+dir[d][1]][1] = 1;
						newGraph[c][j][0] = 0;
					}
				}
			}

		} else if(d == 2) { // <-
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(newGraph[i][j][0]==0)
						continue;
					int c = j;
					while(c-1 >=0 && newGraph[i][c-1][0]==0) 
						c--;
					if(c!=j) {
						newGraph[i][c][0] = newGraph[i][j][0];
						newGraph[i][j][0] = 0;
					}
					
					if(i+dir[d][0] >=0 && i+dir[d][0] <N && c+dir[d][1] >=0 && c+dir[d][1] <N
							&& newGraph[i][c][0] == newGraph[i+dir[d][0]][c+dir[d][1]][0] &&  newGraph[i+dir[d][0]][c+dir[d][1]][1]==0) {
						newGraph[i+dir[d][0]][c+dir[d][1]][0] += newGraph[i][c][0];
						newGraph[i+dir[d][0]][c+dir[d][1]][1] = 1;
						newGraph[i][c][0] = 0;
					}
				}
			}


		} else { //위

			for(int j=0; j<N; j++) {
				for(int i=0; i<N; i++) {
					if(newGraph[i][j][0]==0)
						continue;
					int c = i;
					while(c-1 >=0 && newGraph[c-1][j][0]==0) 
						c--;
					if(c!=i) {
						newGraph[c][j][0] = newGraph[i][j][0];
						newGraph[i][j][0] = 0;
					}
					
					if(c+dir[d][0] >=0 && c+dir[d][0] <N && j+dir[d][1] >=0 && j+dir[d][1] <N
							&& newGraph[c][j][0] == newGraph[c+dir[d][0]][j+dir[d][1]][0] &&  newGraph[c+dir[d][0]][j+dir[d][1]][1]==0) {
						newGraph[c+dir[d][0]][j+dir[d][1]][0] += newGraph[c][j][0];
						newGraph[c+dir[d][0]][j+dir[d][1]][1] = 1;
						newGraph[c][j][0] = 0;
					}
				}
			}

		}

		for(int i=0; i<4; i++) 
			recur(i, count+1, newGraph);
	}

	public static void prt(int [][][] g) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++)
				System.out.print(g[i][j][0] + " ");
			System.out.println();
		}
		System.out.println();
	}

}

