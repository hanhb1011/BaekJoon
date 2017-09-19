import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static int N;
	static int K;
	static int visited[];
	static int count=0;

	static void getPrime() {

		for(int i=2; i<=N; i++) {
			if(visited[i]==1)
				continue;
			count++;
			if(count == K) {
				System.out.println(i);
				return;
			}
			for(int j=i; i*j<=N; j++) {
				if(visited[i*j]==1)
					continue;
				count++;
				if(count == K) {
					System.out.println(i*j);
					return;
				}
				visited[i*j]=1;
			}
			
		}
	}


	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		N = scanner.nextInt();
		K = scanner.nextInt();
		visited = new int[N+1];

		getPrime();
	}

}
