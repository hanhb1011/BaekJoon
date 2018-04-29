import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=Arrays.stream(new int[5]).map(i->sc.nextInt()).sorted().toArray();
		System.out.println(Arrays.stream(a).reduce(0, (i,j)->i+j)/5+"\n"+a[2]);
	}
}