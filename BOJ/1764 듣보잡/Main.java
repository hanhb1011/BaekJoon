import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		Queue<String> q=new PriorityQueue<>();
		Object[] a= Arrays.stream(new String[N]).map(i->sc.next()).sorted().toArray();
		for(int m=0;m<M;m++) {
			int idx=Arrays.binarySearch(a, sc.next());
			if(idx>=0)
				q.add(a[idx]+"");
		}
		System.out.println(q.size());
		while(!q.isEmpty())
			System.out.println(q.poll());
	}
}