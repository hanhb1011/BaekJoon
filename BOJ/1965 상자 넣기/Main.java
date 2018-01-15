import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] box = new int[N];
		Integer []dp = Arrays.stream(new int[N]).boxed().toArray(Integer[]::new);
		for(int i=0; i<N; i++)
			box[i] = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(box[i]>box[j])
					dp[i] = dp[i] > dp[j] + 1 ? dp[i] : dp[j] + 1;
			}
		}
		
		System.out.println(Collections.max(Arrays.asList(dp))+1);
	}
}