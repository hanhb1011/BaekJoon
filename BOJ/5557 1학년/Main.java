import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray();
		long[][] dp = new long[N][21];
		dp[0][a[0]]=1;

		for(int i=1;i<N-1;i++)
			for(int j=0;j<=20;j++){
				if(j-a[i]>=0)
					dp[i][j-a[i]]+=dp[i-1][j];
				if(j+a[i]<=20)
					dp[i][j+a[i]]+=dp[i-1][j];
			}

		System.out.println(dp[N-2][a[N-1]]);
	}
}