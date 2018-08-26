import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int[] a = Arrays.stream(new int[5]).map(i->sc.nextInt()).sorted().toArray();
			System.out.println(a[3]-a[1]>=4?"KIN":(a[1]+a[2]+a[3]));
		}
	}
}