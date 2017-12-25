import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		/* 카잉 달력 해결 ->
		 * 1 1 -> 2 2 -> 3 3 -> 4 4 -> ... -> M*N번 반복
		 * 여기서 각각 M과 N으로 %하면 현재 <x:y> 구하기 가능
		 * 위의 규칙으로 ㄱㄱ
		 */
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

