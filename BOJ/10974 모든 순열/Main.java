import java.util.Scanner;

public class Main {
	
	public static StringBuilder sb = new StringBuilder(); 
	public static void recur(int count, int newNum, int[] nums, int[] visited) {
		nums[count++] = newNum;
		visited[newNum] = 1;
		
		if(count == nums.length) {
			for(int i=0; i<nums.length; i++)
				sb.append(nums[i] + " ");
			sb.append("\n");
			visited[newNum] = 0;
			return;
		}

		for(int i=1; i<=nums.length; i++) 
			if(visited[i]==0) 
				recur(count, i, nums,visited);
		
		visited[newNum] = 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=1; i<=N; i++)
			recur(0, i, new int[N], new int[N+1]);
		System.out.println(sb);
	}
}

