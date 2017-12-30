import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		while(true) {
			int K = scanner.nextInt();
			if(K==0)
				break;
			int []nums = new int[K];
			for(int i=0; i<K; i++)
				nums[i] = scanner.nextInt();
			for(int i=0; i<K-5; i++)
				recur(nums, new int[6], 0, nums[i], i, result);
			result.append("\n");
		}
		System.out.println(result);
	}

	static void recur(int[] nums, int[]que, int count, int num, int idx, StringBuilder result) {
		que[count++] = num;
		if(count==6) {
			for(int j=0; j<count; j++)
				result.append(que[j]+" ");
			result.append("\n");
			return;
		}
		for(int j=idx+1; j<nums.length; j++)
			recur(nums, que, count, nums[j], j, result);
	}
}

