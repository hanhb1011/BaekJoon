import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		Loop : for(int t=0; t<T; t++) {
			int M = scanner.nextInt(),N = scanner.nextInt(),X = scanner.nextInt(),Y = scanner.nextInt();
			for(int i=0; i*M+X<=M*N; i++) {
				if((i*M+X)%N == Y || ((i*M+X)%N== 0 && Y==N)) {
					sb.append((i*M+X)+"\n");
					continue Loop;
				}
			}
			sb.append(-1+"\n");
		}
		System.out.println(sb);
	}
}

