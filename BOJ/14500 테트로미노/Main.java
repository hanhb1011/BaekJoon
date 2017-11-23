import java.util.Scanner;

class Loc{int y,x,w; Loc(int yy, int xx, int ww){y=yy;x=xx;w=ww;}}

public class Main {

	static int [][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
	static int [][] graph;
	static int Y, X;
	static int result = 0;

	public static void recur(int y, int x, Loc[] locs, int count, int direction) {

		if(count==4) {
			getSumAndCompare(locs);
			return;
		}
		if(count == 2 && y+dir[(direction+1)%4][0] >=0 && y+dir[(direction+1)%4][0] <Y 
				&& x + dir[(direction+1)%4][1] >= 0 && x + dir[(direction+1)%4][1] < X 
				&& y + dir[(direction+3)%4][0] >= 0 && y + dir[(direction+3)%4][0] < Y 
				&& x + dir[(direction+3)%4][1] >= 0 && x + dir[(direction+3)%4][1] < X) {
				locs[2] = new Loc(y+dir[(direction+1)%4][0], x + dir[(direction+1)%4][1], graph[y+dir[(direction+1)%4][0]][x + dir[(direction+1)%4][1]]);
				locs[3] = new Loc(y+dir[(direction+3)%4][0], x + dir[(direction+3)%4][1], graph[y+dir[(direction+3)%4][0]][x + dir[(direction+3)%4][1]]);
				getSumAndCompare(locs);
		}

		for(int i=0; i<4; i++) {
			if(((direction+2)%4 != i || direction==-1) && y+dir[i][0]>=0 && y+dir[i][0]<Y && x+dir[i][1]>=0 && x+dir[i][1]<X) {
				locs[count] = new Loc(y+dir[i][0], x+dir[i][1], graph[y+dir[i][0]][x+dir[i][1]]);
				recur(y+dir[i][0], x+dir[i][1], locs, count+1, i);
			}
		}
	}
	
	public static void getSumAndCompare(Loc[] locs) {
		int count = 0;
		for(int i=0; i<4; i++)
			count+=locs[i].w;		
		result = result > count ? result : count;
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Y = scanner.nextInt();
		X = scanner.nextInt();
		graph = new int[Y][X];

		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++)
				graph[i][j] = scanner.nextInt();

		Loc[] locs = new Loc[4];
		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++) {
				locs[0] = new Loc(i,j, graph[i][j]);
				recur(i, j, locs, 1, -1);
			}

		System.out.println(result);
	}
}

