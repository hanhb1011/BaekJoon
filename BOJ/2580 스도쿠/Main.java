import java.util.Scanner;

public class Main {
	static int[][] board = new int[9][9];
	static int maxIdx = 0;
	static int []y = new int[81], x = new int[81];
	static boolean assigned[][][] = new boolean[3][10][10];

	static boolean recur(int idx){
		if(idx==maxIdx) {
			for(int i=0; i<9; i++) {
				for(int j=0;j<9;j++)
					System.out.print(board[i][j] + " ");
				System.out.println();
			}
			return true;
		}

		for(int i=1; i<=9; i++) {
			if(!assigned[0][y[idx]][i] && !assigned[1][x[idx]][i] && !assigned[2][(y[idx]/3)*3 + x[idx]/3][i]) {
				set(y[idx],x[idx],i,i,true);
				if(!recur(idx+1))
					set(y[idx],x[idx],i, 0,false);
			}
		}
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int n = sc.nextInt();
				set(i,j,n,n,true);
				if(n == 0) {
					y[maxIdx] = i;
					x[maxIdx] = j;
					maxIdx++;
				}
			}
		}
		recur(0);
	}
	static void set(int y, int x, int i, int n, boolean b) {
		board[y][x] = n;
		assigned[0][y][i]=b;
		assigned[1][x][i]=b;
		assigned[2][(y/3)*3 + x/3][i]=b;
	}
}