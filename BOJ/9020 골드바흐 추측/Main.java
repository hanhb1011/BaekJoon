import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), idx=0;
		boolean []p=new boolean[10000];
		int[]pnum=new int[1230];
		int [][]dp=new int[10001][2];
		for(int i=2;i<10000;i++) {
			if(p[i])
				continue;
			pnum[idx++]=i;
			for(int j=i*2;j<10000;j+=i)
				p[j]=true;
		}
		
		for(int i=0;i<1230;i++)
			for(int j=0;j<1230;j++)
				if((pnum[i]+pnum[j])%2==0 && pnum[i]+pnum[j]<=10000 &&(dp[pnum[i]+pnum[j]][0]==0
				||Math.abs(dp[pnum[i]+pnum[j]][0]-dp[pnum[i]+pnum[j]][1])>Math.abs(pnum[i]-pnum[j]))) {
					dp[pnum[i]+pnum[j]][0]=Math.min(pnum[i], pnum[j]);
					dp[pnum[i]+pnum[j]][1]=Math.max(pnum[i], pnum[j]);
				}

		for(int t=0;t<T;t++) {
			int n = sc.nextInt();
			System.out.println(dp[n][0]+" "+dp[n][1]);
		}
	}
}