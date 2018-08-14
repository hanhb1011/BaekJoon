import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);		
		int V=sc.nextInt(),E=sc.nextInt(),d[]=new int[V];
		LinkedList<Integer> l[]=new LinkedList[V];
		for(int i=0;i<V;i++) {
			l[i]=new LinkedList<>();
			d[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<E;i++) {
			int a=sc.nextInt()-1,b=sc.nextInt()-1;
			l[a].add(b);
			l[b].add(a);
		}

		d[0]=0;
		PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->d[a]-d[b]);
		pq.add(0);

		while(!pq.isEmpty()) {
			int a = pq.poll();
			for(int b:l[a]) {
				if(d[a]+1<d[b]) {
					d[b]=d[a]+1;
					pq.add(b);
				}	
			}	
		}
		int max=Arrays.stream(d).reduce(0,(a,b)->a<b?b:a);
		int cnt=0,res=0;
		for(int i=0;i<V;i++) {
			if(d[i]==max) {
				if(cnt==0)
					res=i+1;
				cnt++;
			}
		}
		System.out.println(res+" "+max+" "+cnt);
		
	}
}