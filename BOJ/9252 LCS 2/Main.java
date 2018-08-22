import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		char[] A= (" "+sc.next()).toCharArray(), B=(" "+sc.next()).toCharArray();
		int [][]dp=new int[A.length][B.length], dy=new int[A.length][B.length], dx=new int[A.length][B.length];

		for(int i=1;i<A.length;i++)
			for(int j=1;j<B.length;j++)
				if(A[i] == B[j]) {
					dp[i][j] = dp[i-1][j-1]+1;
					dy[i][j] = i;
					dx[i][j] = j;
				} else if(dp[i-1][j] > dp[i][j-1]) {
					dp[i][j] = dp[i-1][j];
					dy[i][j] = dy[i-1][j];
					dx[i][j] = dx[i-1][j];
				} else {
					dp[i][j] = dp[i][j-1];
					dy[i][j] = dy[i][j-1];
					dx[i][j] = dx[i][j-1];
				}
		StringBuffer s=new StringBuffer();
		int y=dy[A.length-1][B.length-1],x=dx[A.length-1][B.length-1];
		while(y>=0 && x>=0) {
			if(A[y]==B[x])
				s.append(A[y]);
			int py=y, px=x;
			if(py<=0 || px<=0)
				break;
			y=dy[py-1][px-1];
			x=dx[py-1][px-1];
		}
		System.out.println(dp[A.length-1][B.length-1]);
		System.out.println(s.reverse().substring(1));
	}
}