import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		class Node{int n,w;Node(int nn, int ww){n=nn;w=ww;}}
		int N=sc.nextInt(), M=sc.nextInt(), c=0;
		int []visit = new int[N];
		int [][]grp = new int[N][N];
		for(int i=0; i<M; i++) {
			int a=sc.nextInt()-1,b=sc.nextInt()-1,w=sc.nextInt();
			grp[a][b]=w; grp[b][a]=w;
		}
		PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->{return a.w-b.w;});
		pq.add(new Node(0,0));
		while(!pq.isEmpty()) {
			Node u = pq.poll();
			if(visit[u.n]==1)
				continue;
			visit[u.n]=1;
			c+=u.w;
			for(int i=0;i<N;i++)
				if(visit[i]==0 && grp[u.n][i]!=0)
					pq.add(new Node(i, grp[u.n][i]));
		}
		System.out.println(c);
	}
}