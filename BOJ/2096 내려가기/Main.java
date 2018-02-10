import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int [] d={-1,0,1};
		int [][] m=new int[N][3];
		int [][][] dp=new int[N][3][2];
		for(int i=0;i<N;i++)
			m[i]=Arrays.stream(m[i]).map(o->sc.nextInt()).toArray();
		for(int i=0;i<3;i++)
			dp[0][i][0]=dp[0][i][1]=m[0][i];
		for(int i=1;i<N;i++)
			for(int j=0;j<3;j++) {
				int min=Integer.MAX_VALUE,max=0;
				for(int k=0;k<3;k++) {
					if(j+d[k]>=0 && j+d[k]<3) {
						max=Math.max(max, dp[i-1][j+d[k]][0]);
						min=Math.min(min, dp[i-1][j+d[k]][1]);
					}
				}
				dp[i][j][0]=m[i][j]+max;
				dp[i][j][1]=m[i][j]+min;
			}
		System.out.println(Collections.max(Arrays.asList(dp[N-1][0][0],dp[N-1][1][0],dp[N-1][2][0])) + " " + (Collections.min(Arrays.asList(dp[N-1][0][1],dp[N-1][1][1],dp[N-1][2][1]))));
	}
}