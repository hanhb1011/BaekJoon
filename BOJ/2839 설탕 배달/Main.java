import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []nums = new int[5001];
		nums[3] = 1;
		nums[5] = 1;
		
		for(int i=6; i<=N; i++){
			
			nums[i] = nums[i-3] !=0 ? nums[i-3]+1 : 0;
			nums[i] = nums[i-5] !=0 ? nums[i-3] !=0 ? Math.min(nums[i], nums[i-5]+1) : nums[i-5]+1 : nums[i];
			
		}
		
		System.out.println(nums[N] == 0 ? -1 : nums[N]);
		
	}
}