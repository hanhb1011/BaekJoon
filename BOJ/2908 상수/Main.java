import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] nums = new int[2];
		for(int n= 0; n<2; n++) {
			String str = scanner.next();
			for(int i=str.length()-1; i>=0; i--)
				nums[n] += (str.charAt(i)-48) * Math.pow(10, i);
		}
		
		System.out.println(nums[0] > nums[1] ? nums[0] : nums[1]);
	}
}
