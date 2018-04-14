import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int V=sc.nextInt(), E=sc.nextInt(), vis[]=new int[V],res[]=new int[V],c[]=new int[V];
			List<Integer> []l=new LinkedList[V];
			Stack<Integer> stk = new Stack<>();
			for(int i=0;i<V;i++){ l[i]=new LinkedList<>(); c[i]=sc.nextInt(); }
			while(E-->0) { l[sc.nextInt()-1].add(sc.nextInt()-1); }
			int D=sc.nextInt()-1;

			for(int i=0;i<V;i++)
				if(vis[i]==0)
					ts(i,stk,vis,l);
			while(!stk.isEmpty()){
				int u=stk.pop();
				res[u]=res[u]==0?c[u]:res[u];
				for(int v:l[u])
					res[v]=Math.max(res[u]+c[v], res[v]);
			}

			System.out.println(res[D]);
		}
	}

	static void ts(int u,Stack<Integer> stk, int[] vis, List<Integer>[] l){
		vis[u]=1;
		for(int v:l[u])
			if(vis[v]==0)
				ts(v,stk,vis,l);
		stk.push(u);
	}
}