import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//피사노 주기에 따르면, 1,000,000으로 나눈 나머지는
		//1,500,000 의 주기를 가진다.
		
		Scanner scanner = new Scanner(System.in);
		int n = new BigInteger(scanner.next()).mod(new BigInteger("1500000")).intValue();
		int [] nums = new int[1500001];
		
		nums[0] = 0;
		nums[1] = 1;
		
		for(int i=2; i<=n; i++) {
			nums[i] = (nums[i-2] + nums[i-1])%1000000;
		}
		
		System.out.println(nums[n]);
		
	}
}
