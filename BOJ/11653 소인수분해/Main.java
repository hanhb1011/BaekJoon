import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int num = N;
		int []pnums = new int[N+1];
		StringBuilder result = new StringBuilder();
		
		for(int i=2; i<=N; i++) {
			if(pnums[i]==1)
				continue;
			else {
				int n=i+i;
				while(n<=N) {
					pnums[n]=1;
					n+=i;
				}
				while(num%i==0) {
					num/=i;
					result.append(i+"\n");
				}
			}
		}
		System.out.println(result);
	}	
}

