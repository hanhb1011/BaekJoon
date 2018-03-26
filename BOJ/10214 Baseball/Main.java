import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int a=0,b=0;
			for(int i=0;i<9;i++) {
				a+=sc.nextInt();
				b+=sc.nextInt();
			}
			System.out.println(a>b?"Yonsei":a<b?"Korea":"Draw");
		}
	}
}