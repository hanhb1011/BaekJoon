import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=10,r=0,c=0;
		while(i-->0)
			r=Math.max(r, c=c-sc.nextInt()+sc.nextInt());
		System.out.println(r);
	}
}