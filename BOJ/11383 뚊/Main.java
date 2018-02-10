import java.util.*;
import java.util.stream.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		Object []a=Arrays.stream(new String[2]).map(i->Arrays.stream(new String[N]).map(s->sc.next()).reduce("", (p,q)->p+q)).toArray();
		StringBuffer sb=new StringBuffer((String)a[0]);
		IntStream.range(0, N*M).forEach(i->{sb.insert(i*2, ((String)a[0]).charAt(i));});
		System.out.println(sb.toString().compareTo((String)a[1])==0?"Eyfa":"Not Eyfa");
	}
}