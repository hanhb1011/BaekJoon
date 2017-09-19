import java.util.Scanner;

public class Main {

	static int M, N;
	static int visited[];
	static int count=0;
	static StringBuffer result = new StringBuffer();
	
	static void getPrime() {

		for(int i=2; i<=N; i++) {
			if(visited[i]==1)
				continue;
			if(M <= i)
				result.append(i + "\n");
			for(int j=i; (long) i*j<=N; j++) {
				if(visited[i*j]==1)
					continue;
				visited[i*j]=1;
			}
		}
	}


	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		M = scanner.nextInt();
		N = scanner.nextInt();
		visited = new int[N+1];
		
		getPrime();
		System.out.println(result);
	}

}
