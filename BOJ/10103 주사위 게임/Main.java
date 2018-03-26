import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),a=100,b=100;
		while(N-->0) {
			int i=sc.nextInt(),j=sc.nextInt();
			a-=i<j?j:0; b-=i>j?i:0;
		}
		System.out.println(a+"\n"+b);
	}
}