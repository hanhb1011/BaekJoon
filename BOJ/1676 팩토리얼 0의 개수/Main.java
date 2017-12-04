import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;

		BigInteger []nums = new BigInteger[N+1];
		nums[0] = new BigInteger("1");
		
		for(int i=1; i<=N; i++)
			nums[i] = nums[i-1].multiply(new BigInteger(String.valueOf(i)));
		
		String num = nums[N].toString();
		for(int i=num.length()-1; i>=0; i--)
			if(num.charAt(i)=='0')
				count++;
			else
				break;
		
		System.out.println(count);
	}
}

