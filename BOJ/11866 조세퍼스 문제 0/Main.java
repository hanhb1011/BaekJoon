import java.util.*;
public class Main{
	static int a=0;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),idx=M-1;
		List<Integer> l=new LinkedList<>();
		StringBuffer sb=new StringBuffer("<");
		for(int i=0;i<N;i++)
			l.add(i+1);
		while(true) {
			sb.append(l.remove(idx)+", ");
			if(l.isEmpty())
				break;
			idx=(idx+M-1)%l.size();
		}
		System.out.println(sb.substring(0, sb.length()-2)+">");
	}
}