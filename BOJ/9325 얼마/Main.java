import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int n=sc.nextInt(), M=sc.nextInt();
			while(M-->0)
				n+=sc.nextInt()*sc.nextInt();
			System.out.println(n);
		}
	}
}