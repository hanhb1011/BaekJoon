import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N;
		while((N=sc.nextInt())!=0) {
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			pq.add(0);
			while(N-->0)
				pq.add(sc.nextInt());
			int c=200,last=0;
			while(!pq.isEmpty()) {
				int loc=pq.poll();
				if(c >= loc)
					c = loc+200;
				last=loc;
			}
			System.out.println(c>=1422 && 2844-c<last?"POSSIBLE":"IMPOSSIBLE");
		}
	}
}