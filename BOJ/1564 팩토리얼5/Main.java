import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long []nums = new long[N+1];
		nums[0] = 1;
		for(int i=1;i<=N;i++) {
			nums[i] = nums[i-1]*i;
			while(nums[i]%10==0) {
				nums[i]/=10;
			}
			nums[i] = nums[i]%1000000000000l;
		}
		nums[N]=nums[N]%100000;
		String result = "";
		int count = 5-String.valueOf(nums[N]).length();
		for(int i=0; i<count; i++)
			result+="0";
		System.out.println(result+nums[N]);
	}
}