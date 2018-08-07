import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100000],dp[]=new int[1000001],N=sc.nextInt(),res=1;
		for(int i=0;i<N;i++)
			a[i]=sc.nextInt();
		dp[a[0]]=1;
		for(int i=1;i<N;i++) {
			if(dp[a[i]-1]==0)
				dp[a[i]]=1;
			else
				dp[a[i]]=Math.max(dp[a[i]], dp[a[i]-1]+1);
			res=Math.max(res, dp[a[i]]);
		}
		System.out.println(res);
	}
}