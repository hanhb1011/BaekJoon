import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Y=sc.nextInt(), X=sc.nextInt(),a[][]=new int[Y][X],v[][]=new int[Y][X],d[][]=new int[Y][X],D[][]= {{0,1},{0,-1},{1,0},{-1,0}},max=1,cnt=0;
		class N{int y,x; N(int i,int j){y=i;x=j;}}
		PriorityQueue<N> pq = new PriorityQueue<>((i,j)->d[i.y][i.x]-d[j.y][j.x]);
		for(int i=0;i<Y;i++)
			for(int j=0;j<X;j++)
				a[i][j]=sc.nextInt();
		pq.add(new N(0,0));
		while(!pq.isEmpty()) {
			N n = pq.poll();
			for(int i=0;i<4;i++) {
				int y=n.y+D[i][0], x=n.x+D[i][1];
				if(y>=0 && y<Y && x>=0 && x<X && v[y][x]==0) {
					v[y][x]=1;
					if(a[y][x]==1)
						d[y][x]=d[n.y][n.x]+1;
					else
						d[y][x]=d[n.y][n.x];
					max=Math.max(max, d[y][x]);
					pq.add(new N(y,x));
				}
			}
		}

		for(int i=0;i<Y;i++)
			for(int j=0;j<X;j++)
				if(d[i][j]==max && a[i][j]==1)
					cnt++;
		System.out.println(max+"\n"+cnt);
	}
}