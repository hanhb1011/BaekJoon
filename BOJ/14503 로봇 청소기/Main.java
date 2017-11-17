import java.util.Scanner;

public class Main {

	static int[][] graph;
	static int Y, X, curY, curX, D; //D가 0인 경우에는 북쪽을, 1인 경우에는 동쪽을, 2인 경우에는 남쪽을, 3인 경우에는 서쪽
	static int[][] dir = {{-1, 0},{0, 1},{1, 0},{0, -1}};//북 동 남 서
	static int count;

	public static void search() {
		//1. 
		if(graph[curY][curX] == 0) {
			graph[curY][curX] = 2;
			count++;
		}

		//2.
		for(int i=1; i<5; i++) {
			if(curY+dir[(D+4-i)%4][0]>=0 && curY+dir[(D+4-i)%4][0] <Y 
					&& curX+dir[(D+4-i)%4][1]>=0 && curX+dir[(D+4-i)%4][1] < X
					&&  graph[curY+dir[(D+4-i)%4][0]][curX+dir[(D+4-i)%4][1]] == 0) {
				curY = curY+dir[(D+4-i)%4][0];
				curX = curX+dir[(D+4-i)%4][1];
				D = (D+4-i)%4;
				search();
				return; //2-1 and 2-2
			}
		}

		//2-3 and 2-4
		if(curY+dir[(D+2)%4][0]>=0 && curY+dir[(D+2)%4][0] <Y 
				&& curX+dir[(D+2)%4][1]>=0 && curX+dir[(D+2)%4][1] < X
				&& graph[curY+dir[(D+2)%4][0]][curX+dir[(D+2)%4][1]] !=1) {
			curY = curY+dir[(D+2)%4][0];
			curX = curX+dir[(D+2)%4][1];
			search();
		}

	}

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		Y = scanner.nextInt();
		X = scanner.nextInt();
		curY = scanner.nextInt();
		curX = scanner.nextInt();
		D = scanner.nextInt();
		graph = new int[Y][X]; //빈 칸은 0, 벽은 1, 청소된 곳은 2

		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++)
				graph[i][j] = scanner.nextInt();

		search();
		System.out.println(count);
	}

}
