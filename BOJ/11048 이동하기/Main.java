import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);
		int Y = scanner.nextInt();
		int X = scanner.nextInt();
		int [][] graph = new int[Y][X]; //dp 결과도 graph에 저장

		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++)
				graph[i][j] = scanner.nextInt();

		//initialize
		for(int i=1; i<X; i++)
			graph[0][i] +=graph[0][i-1];
		for(int i=1; i<Y; i++)
			graph[i][0] +=graph[i-1][0];

		//dp
		for(int i=1; i<Y; i++)
			for(int j=1; j<X; j++)
				graph[i][j] += graph[i-1][j] > graph[i][j-1] ? 
						graph[i-1][j] > graph[i-1][j-1] ? graph[i-1][j] : graph[i-1][j-1] :
							graph[i][j-1] > graph[i-1][j-1] ? graph[i][j-1] : graph[i-1][j-1];
							
		System.out.println(graph[Y-1][X-1]);
	}
}
