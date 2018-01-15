import java.util.Scanner;

public class Main {
	static int[][] scr;
	static int N;
	
	static String recur(int n, int y, int x) {
		if(n==1)
			return String.valueOf(scr[y][x]);
		
		String a = recur(n/2, y,x);
		String b = recur(n/2, y,x+n/2);
		String c = recur(n/2, y+n/2, x);
		String d = recur(n/2, y+n/2, x+n/2);
		
		if(a.equals(b) && b.equals(c) && c.equals(d) && (a.equals("0")|| a.equals("1")))
			return a;
		else
			return "("+a+b+c+d+")";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		scr = new int[N][N];
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			for(int j=0; j<N; j++)
				scr[i][j] = Integer.valueOf(s.charAt(j)-48);
		}
		
		System.out.println(recur(N,0,0));
	}
}