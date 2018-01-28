import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		class Node{int n,w; Node(int nn,int ww){n=nn;w=ww;}}
		int V=sc.nextInt(),E=sc.nextInt(),K=sc.nextInt()-1;
		List<Node>[]al=Arrays.stream(new ArrayList[V]).map(l->{return new ArrayList<Node>();}).toArray(List[]::new);
		int[] dist=Arrays.stream(new int[V]).map(i->Integer.MAX_VALUE).toArray();
		dist[K]=0;
		for(int i=0;i<E;i++)
			al[sc.nextInt()-1].add(new Node(sc.nextInt()-1,sc.nextInt()));
		PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->{return a.w-b.w;});
		pq.add(new Node(K, dist[K]));
		while(!pq.isEmpty()){
			Node u = pq.poll();
			if(u.w>dist[u.n])
				continue;
			for(Node v:al[u.n]) {
				if(dist[v.n]>dist[u.n]+v.w) {
					dist[v.n]=dist[u.n]+v.w;
					pq.add(new Node(v.n,dist[v.n]));
				}
			}
		}
		Arrays.stream(dist).forEach(i->sb.append(i==Integer.MAX_VALUE?"INF\n":(i+"\n")));
		System.out.println(sb);
	}
}