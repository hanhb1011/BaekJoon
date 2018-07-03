import java.util.*;

public class Main{

	public static void main(String args[]){
		char[] s = new Scanner(System.in).next().toCharArray();
		int[] dp = new int[s.length];
		dp[0] = s[0]!='0'?1:0;
		for(int i=1;i<s.length;i++) {
			if(s[i]!='0')
				dp[i] = dp[i-1];
			int n = (s[i-1]-48)*10+s[i]-48;
			if(n>=10 && n<27)
				dp[i] = i==1?dp[i]+1:(dp[i]+dp[i-2])%1000000;
			if(s[i]=='0' && s[i-1]=='0')
				dp[i] = 0;
		}
		System.out.println(dp[s.length-1]);
	}
}