import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int []num = new int[N];
		int count = 0, i=0;
		StringBuilder result = new StringBuilder(100000);
		result.append("<");
		
		while(count!=N) {
			int idxCount = 0;
			while(idxCount!=M) {
				i=(i+1)%N;
				if(num[i]==0)
					idxCount++;
			}
			result.append((i == 0 ? N : i) + (count== N-1? "" :", ") );
			num[i] = 1;
			count++;
		}
		
		result.append(">");
		System.out.println(result);

	}
}


