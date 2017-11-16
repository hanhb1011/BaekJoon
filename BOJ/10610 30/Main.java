import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String n = scanner.next();

		int [] nums = new int[10];
		for(int i=0; i<n.length(); i++)
			nums[n.charAt(i)-48]++;

		StringBuilder sb = new StringBuilder(100000);
		for(int i=9; i>=0; i--) {
			for(int j=0; j<nums[i]; j++) {
				sb.append(i);
			}
		}
		BigInteger bi = new BigInteger(sb.toString());
		System.out.println(bi.mod(new BigInteger("30")).toString().equals("0") ? sb : -1);

	}
}
