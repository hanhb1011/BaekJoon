import java.util.*;
public class Main{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N =sc.nextInt();
		
		int[]m = Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray();
		int[] dp = Arrays.stream(new int[N]).map(i->Integer.MAX_VALUE).toArray();
		dp[0] = 0;
		
		for(int i=0;i<N;i++)
			for(int j=1; j<=m[i]; j++) 
				if(i+j<N && dp[i+j]>dp[i]+1 && dp[i]!=Integer.MAX_VALUE) 
					dp[i+j]=dp[i]+1;
		
		System.out.println(dp[N-1]==Integer.MAX_VALUE ? -1 : dp[N-1]);
	}
}