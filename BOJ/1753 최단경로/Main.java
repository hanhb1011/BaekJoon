import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		class Node implements Comparable<Node>{int w; int i; int d; public Node(int i, int w) { this.w = w; this.i = i; }
			public int compareTo(Node o) {
				if(d>o.d) return 1;
				else if(d<o.d) return -1;
				else return 0;
			};
		}
		
		int V = scanner.nextInt(), E = scanner.nextInt(), K = scanner.nextInt(); //시작 정점의 번호
		ArrayList<Node> []list = new ArrayList[V+1];
		for(int i=1; i<=V; i++)
			list[i] = new ArrayList<>();
			
		for(int i=0; i<E; i++) {
			int[] inputs = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()}; //u v w
			list[inputs[0]].add(new Node(inputs[1], inputs[2])); //노트  u에 간선 v 추가
		}
		
		int [] dist = new int[V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[K] = 0;
		
		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.add(new Node(K, 0));
		
		while(!queue.isEmpty()) { 
			Node node = queue.poll();
			if(node.d > dist[node.i])
				continue;
			
			Iterator<Node> it = list[node.i].iterator();
			while(it.hasNext()) { 
				Node next = it.next();
				if(dist[next.i] > dist[node.i] + next.w) {
					dist[next.i] = dist[node.i] + next.w;
					next.d = dist[next.i];
					queue.add(next);
				}
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i=1; i<=V; i++)
			result.append(dist[i] == Integer.MAX_VALUE ? "INF\n" : (dist[i]+"\n"));
		System.out.println(result);
		
	}
}
