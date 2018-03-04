import java.util.*;
public class Main{
	static int[]dp=new int[1000000];
	static int H(int n){
		if(n==1)
			return 1;
		if(n>1000000) {
			if(n%2==0)
				return Math.max(n,H(n/2));
			else
				return Math.max(n, H(n*3+1));
		} else {
			int ret=dp[n];
			if(ret!=0)
				return ret;

			if(n%2==0)
				ret = Math.max(n,H(n/2));
			else
				ret = Math.max(ret, H(n*3+1));
			return dp[n]=ret;
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<T;i++) 
			sb.append(H(sc.nextInt())).append("\n");
		System.out.println(sb);
	}
}