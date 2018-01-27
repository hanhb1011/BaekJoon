import java.util.*;
import java.util.stream.*;
public class Main{
	static long a=1,b=1,c;
	public static void main(String[] args){
		IntStream.range(2,new Scanner(System.in).nextInt()).forEach(i->{c=b;b+=a;a=c;});System.out.println(b);
	}
}