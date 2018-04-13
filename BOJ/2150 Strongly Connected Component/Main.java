import java.util.*;

public class Main{
	static Stack<Integer> stk = new Stack<>();
	static List<Integer>[] al,bl,res;
	static PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b)->a.get(0)-b.get(0));
	static int vis[], rIdx=0;

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt(), E=sc.nextInt();
		vis=new int[V+1];
		al= new LinkedList[V+1]; bl=new LinkedList[V+1]; res=new ArrayList[V];
		for(int i=1;i<=V;i++) {
			al[i] = new LinkedList<>();
			bl[i] = new LinkedList<>();
		}
		while(E-->0) {
			int a=sc.nextInt(), b=sc.nextInt();
			al[a].add(b);
			bl[b].add(a);
		}

		for(int i=1;i<=V;i++)
			if(vis[i]==0)
				ts(i);

		Arrays.fill(vis, 0);

		while(!stk.isEmpty()) {
			int v=stk.pop();
			if(vis[v]==0) {
				res[rIdx]=new ArrayList<>();
				tcc(v);
				res[rIdx++].sort((a,b)->a-b);
			}
		}

		for(int i=0;i<rIdx;i++)
			pq.add(res[i]);

		System.out.println(rIdx);
		while(!pq.isEmpty()) {
			List<Integer> l = pq.poll();
			for(int a:l)
				System.out.print(a+" ");
			System.out.println("-1");
		}
	}
	
	static void ts(int v) {
		vis[v]=1;
		for(int u:al[v])
			if(vis[u]==0)
				ts(u);
		stk.push(v);
	}
	
	static void tcc(int v) {
		res[rIdx].add(v);
		vis[v]=1;
		for(int u:bl[v])
			if(vis[u]==0)
				tcc(u);
	}
}