import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		for(int t=0;t<T;t++) {
			int N = sc.nextInt();
			int[] c = Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray();
			int M = sc.nextInt()+1;
			int[][]dp = new int[N][M];

			for(int i=0;i<N;i++) {
				if(c[i]<M)
					dp[i][c[i]]=1;
				for(int j=1;j<M;j++) {
					if(i>0) {
						if(j-c[i]>=0)
							dp[i][j]+=dp[i-1][j]+dp[i][j-c[i]];
						else
							dp[i][j]+=dp[i-1][j];
					} else
						dp[i][j]=j%c[i]==0?1:0;
				}
			}

			System.out.println(dp[N-1][M-1]);
		}
	}
}