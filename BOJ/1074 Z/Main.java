import java.util.Scanner;

public class Main {
	static int count = 0;
	static boolean b = false;
	static int[][] d = {{0,0},{0,1},{1,0},{1,1}};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		recur(sc.nextInt(),0,0, sc.nextInt(), sc.nextInt());
	}
	
	static void recur(int N,int y,int x,int R,int C) {
		if(N==1) {
			for(int i=0; i<4; i++) {
				if(y+d[i][0] == R && x+d[i][1] == C)
					System.out.println(count);
				count++;
			}
			return;
		}
		recur(N-1, y,x,R,C);
		recur(N-1, y, x+(1<<N-1),R,C);
		recur(N-1, y+(1<<N-1), x,R,C);
		recur(N-1, y+(1<<N-1), x+(1<<N-1),R,C);
	}
}