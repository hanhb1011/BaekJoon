import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
	static int a=0,b=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] s = Arrays.stream(new int[20]).map(i->sc.nextInt()).toArray();
		IntStream.range(0, 10).forEach(i->{a=s[i]>s[i+10]?a+1:a;b=s[i]<s[i+10]?b+1:b;});
		System.out.println(a>b?'A':a==b?'D':'B');
	}
}