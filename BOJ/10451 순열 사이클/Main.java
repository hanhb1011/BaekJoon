import java.util.*;
public class Main{
	static int count = 0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++){
			count = 0;
			int N=sc.nextInt();
			int [][] graph = new int[N][N];
			int []from = new int[N], to = new int[N];
			for(int i=0; i<N; i++) {
				from[i] = i;
				to[i] = sc.nextInt()-1;
				graph[from[i]][to[i]] = 1;
			}
			
			int [] visit= new int[N];
			for(int i=0; i<N; i++)
				if(visit[i]==0)
					recur(i, visit, graph);
			System.out.println(count);
		}
	}
	
	static void recur(int v, int[] visit, int[][]graph) {
		visit[v]=1;
		for(int i=0;i<visit.length;i++)
			if(graph[v][i]==1 && visit[i]==0)
				recur(i, visit, graph);
			else if(graph[v][i]==1 && visit[i]==1)
				count++;
	}
}