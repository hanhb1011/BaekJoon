import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = scanner.nextInt();	
			int []doors = new int[N+1]; //0 : 열림. 1 : 닫힘
			
			for(int i=2; i<=N; i++) {
				int index = i;
				while(index<=N) {
					doors[index] = doors[index] == 0 ? 1 : 0;
					index=index+i;
				}
			}
			int resultCount = 0;
			for(int i=1; i<=N; i++)
				resultCount += doors[i] == 0 ? 1 : 0;
			System.out.println(resultCount);
		}
	}
}