import java.util.*;

public class Main{
	static int[] p;

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt(), E=sc.nextInt(),res=0,l=0;
		p=new int[V];
		for(int i=0;i<V;i++)
			p[i]=i;
		class Edge{int a,b,w; Edge(int i,int j,int k){a=i;b=j;w=k;}}
		Edge[] edges = new Edge[E];
		for(int i=0;i<E;i++)
			edges[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
		Arrays.sort(edges, (a,b)->a.w-b.w);
		for(int i=0;i<E&&l<V-2;i++) {
			Edge e = edges[i];
			if(find(e.a) != find(e.b)) {
				res+=e.w;
				union(e.a,e.b);
				l++;
			}
		}
		System.out.println(res);
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		p[a] = b;
	}

	static int find(int a) {
		if(p[a]==a)
			return a;
		return p[a]=find(p[a]);
	}
}