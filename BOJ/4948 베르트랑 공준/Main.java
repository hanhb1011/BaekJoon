import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int[] num = new int[246913];
		for(int i=2; i<=246912; i++) {
			int j = 2*i;
			while(j<=246912) {
				num[j] = 1;
				j+=i;
			}
		}
			
		while(true) {
			int n = sc.nextInt(), c= 0;
			if(n==0)
				break;
			for(int i=n+1; i<=2*n; i++)
				if(num[i]==0)
					c++;
			sb.append(c).append("\n");
		}
		System.out.println(sb);
		
	}
}