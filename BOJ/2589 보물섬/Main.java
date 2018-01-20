import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		class Loc{int y,x; Loc(int yy, int xx){y=yy;x=xx;}}
		int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
		int res = 0;
		ArrayDeque<Loc> Lq = new ArrayDeque<>();
		
		int Y = sc.nextInt(), X = sc.nextInt();
		int [][]map = new int[Y][X];
		for(int i=0; i<Y; i++) {
			String s = sc.next();
			for(int j=0; j<X; j++) {
				map[i][j] = s.charAt(j);
				if (map[i][j]== (int)'L')
					Lq.add(new Loc(i,j));
			}
		}
		
		while(!Lq.isEmpty()) {
			Loc loc = Lq.poll();
			ArrayDeque<Loc> q = new ArrayDeque<>();
			int [][]dist = new int[Y][X];
			dist[loc.y][loc.x]=1;
			q.add(loc);
			while(!q.isEmpty()) {
				Loc l = q.poll();
				for(int i=0; i<4; i++)
					if(l.y+dir[i][0] >=0 && l.y+dir[i][0]<Y && l.x+dir[i][1]>=0 && l.x+dir[i][1]<X
					&& map[l.y+dir[i][0]][l.x+dir[i][1]]==(int)'L' && dist[l.y+dir[i][0]][l.x+dir[i][1]]==0) {
						q.add(new Loc(l.y+dir[i][0], l.x+dir[i][1]));
						dist[l.y+dir[i][0]][l.x+dir[i][1]] = dist[l.y][l.x]+1;
						res = dist[l.y+dir[i][0]][l.x+dir[i][1]] > res ? dist[l.y+dir[i][0]][l.x+dir[i][1]] : res;
					}
			}
		}
		
		System.out.println(res == 0 ? 0 : res-1);
	}
}