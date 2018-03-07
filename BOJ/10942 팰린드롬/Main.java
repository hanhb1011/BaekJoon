import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int []a=Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray();
		int [][]dp=new int[N][N]; 
		for(int i=0;i<N;i++)
			dp[i][i]=1;

		for(int n=1;n<N;n++) {
			for(int i=n;i<N-n;i++)
				if(a[i+n]==a[i-n] && dp[i+n-1][i-n+1]>0)
					dp[i+n][i-n]=dp[i-n][i+n]=1;
			for(int i=n;i<N;i++) {
				if(i+n<N && a[i]==a[i+n] && dp[i+n-1][i]>0)
					dp[i+n][i]=dp[i][i+n]=1;
				if(i-n>=0 && a[i]==a[i-n] && dp[i-n+1][i]>0)
					dp[i-n][i]=dp[i][i-n]=1;
			}
		}

		int M=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		while(M-->0)
			sb.append(dp[sc.nextInt()-1][sc.nextInt()-1]+"\n");
		System.out.println(sb);
	}
}