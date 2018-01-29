import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();
			if(n==0)
				sb.append((pq.peek()==null?0:pq.poll())+"\n");
			else
				pq.add(n);
		}
		System.out.println(sb);
	}
}