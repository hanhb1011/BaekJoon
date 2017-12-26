import java.util.Scanner;

public class Main {
	static int[][] board;
	static int result;
	static int N;
	static int [][]dir = {{-1,0},{-1,1},{-1,-1}};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		board = new int[N][N];
		for(int j=0; j<N; j++)
			recur(0,j,0);
		System.out.println(result);
	}


	private static void recur(int y, int x, int count) {
		if(count == N-1) {
			result++;
			return;
		} else if(count < y)
			return;

		board[y][x] = 1;
		for(int j=0; j<N; j++) {
			boolean found = false;
			Loop : for(int i=0; i<3; i++) {
				int yy =y+1, xx= j;
				while(yy+dir[i][0]>=0 && yy+dir[i][0]<N && xx+dir[i][1] >=0 && xx+dir[i][1] <N) {
					yy+=dir[i][0]; 
					xx+=dir[i][1];
					if(board[yy][xx] == 1) {
						found = true;
						break Loop;
					}
				}
			}
			if(!found)
				recur(y+1, j, count+1);

		}
		board[y][x] = 0;
	}
}

