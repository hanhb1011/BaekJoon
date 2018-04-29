import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(), s=new StringBuffer(sc.next());
		PriorityQueue<String> pq=new PriorityQueue<>();
		for(int i=0;i<s.length();i++)
			pq.add(s.substring(i, s.length()));

		while(!pq.isEmpty())
			sb.append(pq.poll()).append("\n");
		System.out.println(sb);
	}
}