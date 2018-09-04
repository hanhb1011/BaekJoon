import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),a[][]=new int[N][M],dy[]={1,-1,0,0},dx[]={0,0,1,-1};
		char[][] map = Arrays.stream(new char[N][]).map(i->sc.next().toCharArray()).toArray(char[][]::new);
		class P{int y,x;P(int i,int j){y=i;x=j;}}
		Queue<P> q=new LinkedList<>();
		q.add(new P(0,0));
		while(!q.isEmpty()) {
			P p=q.poll();
			for(int i=0;i<4;i++) {
				int y=p.y+dy[i], x=p.x+dx[i];
				if(y>=0 && y<N && x>=0 && x<M && a[y][x]==0 && map[y][x]=='1') {
					q.add(new P(y,x));
					a[y][x]=a[p.y][p.x]+1;
				}
			}
		}
		System.out.println(a[N-1][M-1]+1);
	}
}