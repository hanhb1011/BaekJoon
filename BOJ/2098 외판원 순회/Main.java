import java.util.*;
public class Main{
	static int N, m[][]=new int[16][16], dp[][]=new int[16][1<<16];
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				m[i][j]=sc.nextInt();

		System.out.println(r(0,1<<0));
	}

	static int r(int v, int mask) {
		if(mask == (1<<N)-1)
			return m[v][0]>0? m[v][0] : 100000000;
		if(dp[v][mask]>0)
			return dp[v][mask];

		int ret = 100000000;
		for(int i=0;i<N;i++)
			if((mask&(1<<i))==0 && m[v][i]>0)
				ret = Math.min(ret, r(i,mask|(1<<i)) + m[v][i]);

		return dp[v][mask]=ret;
	}
}