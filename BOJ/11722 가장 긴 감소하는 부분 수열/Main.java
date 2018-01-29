import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), max=0;
		int[] a = new int[N], dp = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			for(int j=i-1; j>=0; j--) 
				if(a[i]<a[j] && dp[j]+1>dp[i])
					dp[i]=dp[j]+1;	
		
		System.out.println(Arrays.stream(dp).max().getAsInt()+1);
	}
}