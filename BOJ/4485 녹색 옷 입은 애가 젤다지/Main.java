import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N,P=1;
		class Node{int y,x;Node(int a,int b){y=a;x=b;}}
		while((N=sc.nextInt())!=0) {
			int a[][]=new int[N][N], d[][]=new int[N][N], dy[]={0,0,1,-1},dx[]={1,-1,0,0};
			PriorityQueue<Node> pq = new PriorityQueue<>((i,j)->d[i.y][i.x]-d[j.y][j.x]);
			for(int i=0;i<N;i++)
				Arrays.fill(d[i], Integer.MAX_VALUE);
			for(int i=0;i<N*N;i++)
				a[i/N][i%N] = sc.nextInt();
			d[0][0]=a[0][0];
			pq.add(new Node(0,0));

			while(!pq.isEmpty()) {
				Node n=pq.poll();
				for(int i=0;i<4;i++) {
					int y=n.y+dy[i], x=n.x+dx[i];
					if(y>=0 && y<N && x>=0 && x<N && d[n.y][n.x]+a[y][x] < d[y][x]) {
						d[y][x] = d[n.y][n.x]+a[y][x];
						pq.add(new Node(y,x));
					}
				}
			}
			System.out.println("Problem "+P+++": "+d[N-1][N-1]);
		}
	}
}