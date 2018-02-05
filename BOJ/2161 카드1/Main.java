import java.util.*;
import java.util.stream.*;
public class Main{
	public static void main(String[] args){
		Queue<Integer> q=new LinkedList<>();
		IntStream.range(1,new Scanner(System.in).nextInt()+1).forEach(i->{q.add(i);});
		boolean b=true;
		while(!q.isEmpty()){
			if(b)
				System.out.print(q.poll()+" ");
			else
				q.add(q.poll());
			b=!b;
		}
	}
}