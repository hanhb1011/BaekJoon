import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt()*60+sc.nextInt()-45;
		n=n<0?1440+n:n;
		System.out.println(n/60+" "+n%60);
	}
}