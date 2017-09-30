import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	static LinkedList<Integer> adj[];
	static int []cost;
	static int []totalTime;

	static void topologicalSortUtil(int v, int visited[], Stack<Integer> stack){
		visited[v] = 1;
		int i;

		Iterator<Integer> it = adj[v].iterator();
		boolean isTerminal = true;
		while (it.hasNext())
		{
			isTerminal = false;
			i = it.next();
			if (visited[i]==0)
				topologicalSortUtil(i, visited, stack);
		}
		
		stack.push(new Integer(v));
	}


	public static void main(String [] args) {

		//input
		Scanner scanner = new Scanner(System.in);
		StringBuilder resultString = new StringBuilder(1000);
		int T = scanner.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = scanner.nextInt(); //건물의 수
			int K = scanner.nextInt(); //간선 수
			adj = new LinkedList[N+1];
			for(int i=1; i<=N; i++)
				adj[i] = new LinkedList<>();
			cost = new int[N+1]; //건물 코스트
			totalTime = new int[N+1]; //시간
			int []visited = new int[N+1];
			for(int i=1; i<=N; i++)
				cost[i] = scanner.nextInt();
			for(int i=0; i<K; i++) //?
				adj[scanner.nextInt()].add(scanner.nextInt());
			Stack<Integer> stack = new Stack<>();

			int D = scanner.nextInt(); //목적지
			//end of input

			//위상정렬
			//totalTime[i] : 노드 i에 걸린 총시간 저장 > totalTime[D]는 result가 됨.
			//cost[j] + totalTime[i] 와  totalTime[j] 를 비교한 뒤 큰 것 저장
	        for (int i=1; i<=N; i++)
	            if (visited[i] == 0)
	                topologicalSortUtil(i, visited, stack);
	        
	        
			while(!stack.isEmpty()) {
				int node = stack.pop();
				totalTime[node] = totalTime[node] == 0 ? cost[node] : totalTime[node];
				Iterator<Integer> it = adj[node].iterator();
				int i;
				while (it.hasNext())
				{
					i = it.next();
					totalTime[i] = cost[i] + totalTime[node] > totalTime[i] ? cost[i] + totalTime[node] : totalTime[i];
				}
				
			}
			resultString.append(totalTime[D] + "\n");

		}

		System.out.println(resultString);

	}

}