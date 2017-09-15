import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder result = new StringBuilder(100000000); //시간초과 문제를 고려하여 넉넉하게 잡음
		int n = scanner.nextInt();
		int []nums = new int[n];
		
		for(int i=0; i<n; i++)
			nums[i] = scanner.nextInt();
		Arrays.sort(nums); //Quick sort
		for(int i=0; i<n; i++)
			result.append(nums[i] + "\n"); //버퍼에 appending하는 방식으로 시간 단축
		
		System.out.println(result);
	}
}
