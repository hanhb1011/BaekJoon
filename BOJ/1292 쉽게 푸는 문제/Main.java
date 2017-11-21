import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int []seq = new int[1001];
		int idx = 1, sum=0;
		Loop :for(int i=1; i<=45; i++) {
			for(int j=0; j<i; j++) {
				if(idx+j>1000)
					break Loop;
				seq[idx+j] = i;		
			}
			idx+=i;
		}
		
		for(int i=A; i<=B; i++)
			sum+=seq[i];
		System.out.println(sum);
	}
}
