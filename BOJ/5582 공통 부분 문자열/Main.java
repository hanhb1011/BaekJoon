import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char [] A = (" "+sc.next()).toCharArray(), B=(" "+sc.next()).toCharArray();
		int dp [][] = new int[A.length][B.length],r=0;

		for(int i=1;i<A.length;i++)
			for(int j=1;j<B.length;j++)
				if(A[i] == B[j])
					r = Math.max(r, (dp[i][j] = dp[i-1][j-1]+1));
		System.out.println(r);
	}
}