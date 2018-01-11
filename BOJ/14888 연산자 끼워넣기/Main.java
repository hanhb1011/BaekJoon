import java.util.Scanner;

public class Main {
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, N, idx=0;
	static int[][] op = new int[4][11];
	static int[] nums,opIdx = new int[4]; // + - * /

	static void recur(int n, int num, int op) {
		if(op==0) num+=nums[n];
		else if(op==1) num-=nums[n];
		else if(op==2) num*=nums[n];
		else num/=nums[n];

		if(n == N-1) {
			max = num > max ? num : max;
			min = num < min ? num : min;
			return;
		}

		for(int j=0; j<4; j++)
			if(opIdx[j]>0) {
				opIdx[j]--;
				recur(n+1, num, j);
				opIdx[j]++;
			}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		nums = new int[N];

		for(int i=0; i<N; i++)
			nums[idx++] = sc.nextInt();
		for(int i=0; i<4; i++)
			opIdx[i] = sc.nextInt();
		for(int i=0; i<4; i++)
			if(opIdx[i]>0) {
				opIdx[i]--;
				recur(1, nums[0], i);
				opIdx[i]++;
			}
		
		System.out.println(max+"\n"+min);
	}
}