import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static char[][] bd;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		bd = new char[N][2*N-1];
		for(int i=0; i<bd.length; i++)
			Arrays.fill(bd[i], ' ');
		
		recur(N, 0, N-1);
		
		for(int i=0; i<bd.length; i++)
			System.out.println(String.valueOf(bd[i]));
	}
	
	public static void recur(int N, int y, int x) {
		if(N==3) {
			bd[y][x]='*';
			bd[y+1][x-1]='*'; bd[y+1][x+1]='*';
			bd[y+2][x-2]='*'; bd[y+2][x-1]='*'; bd[y+2][x]='*'; bd[y+2][x+1]='*'; bd[y+2][x+2]='*';
			return;
		}
		recur(N/2, y+N/2, x-N/2);
		recur(N/2, y, x);
		recur(N/2, y+N/2, x+N/2);
	}
}