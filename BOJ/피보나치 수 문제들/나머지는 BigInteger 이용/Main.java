import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		BigInteger [] nums = new BigInteger[100000];
		nums[0] = new BigInteger("0");
		nums[1] = new BigInteger("1");
		for(int i=2; i<=n; i++) {
			nums[i] = nums[i-1].add(nums[i-2]);
		}
		System.out.println(nums[n]);
		
	
		
	}
}
