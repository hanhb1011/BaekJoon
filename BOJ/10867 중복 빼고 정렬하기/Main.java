import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Set<Integer> s = new TreeSet<>();
		int n=sc.nextInt();
		while(n-->0)
			s.add(sc.nextInt());
		for(int i:s)
			System.out.println(i);
	}
}