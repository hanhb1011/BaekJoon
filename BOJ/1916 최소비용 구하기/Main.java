import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V=sc.nextInt(), E=sc.nextInt(), d[]=new int[V], m[][]=new int[V][V], MAX=100001; Arrays.fill(d, MAX*V);
		PriorityQueue<Integer> q = new PriorityQueue<>((a,b)-> d[a]-d[b]);
		for(int i=0;i<V;i++)
			Arrays.fill(m[i], MAX);
		while(E-->0){
			int a=sc.nextInt()-1,b=sc.nextInt()-1,w=sc.nextInt();
			m[a][b] = Math.min(m[a][b], w);
		}
		int S=sc.nextInt()-1, D=sc.nextInt()-1;
		d[S]=0;
		q.add(S);
		while(!q.isEmpty()){
			int v=q.poll();
			for(int i=0;i<V;i++)
				if(m[v][i]!=MAX && d[i]>d[v]+m[v][i]){
					d[i]=d[v]+m[v][i];
					q.add(i);
				}
		}

		System.out.println(d[D]);
	}
}