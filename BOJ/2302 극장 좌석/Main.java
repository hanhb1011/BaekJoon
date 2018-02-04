import java.util.*;
import java.util.stream.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int [][]dp = new int[sc.nextInt()+1][3]; dp[0][0]=1;
		IntStream.range(0, sc.nextInt()).forEach(i->{dp[sc.nextInt()-1][2]=1;});
		for(int i=1; i<dp.length; i++) {
			if(dp[i][2]==0 && dp[i-1][2]==0) {
				dp[i][0] = dp[i-1][0]+dp[i-1][1];
				dp[i][1] = i-2>=0?dp[i-2][0]+dp[i-2][1]:1;
			} else {
				dp[i][0] = dp[i-1][0];
				dp[i][1] = dp[i-1][1];
			}
		}
		System.out.println(dp[dp.length-2][0]+dp[dp.length-2][1]);
	}
}