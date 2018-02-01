import java.util.*;
import java.util.stream.*;
public class Main{
	static int a=1,b=1,c=1;
	public static void main(String[] args){
		IntStream.range(1, new Scanner(System.in).nextInt()).forEach(i->{c=(a+b)%15746;a=b;b=c;});
		System.out.println(c);
	}
}