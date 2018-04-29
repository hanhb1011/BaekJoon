import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(),c=0,r=0;
		while(T-->0){
			int n=sc.nextInt();
			if(n!=0)
				r+=++c; 
			else
				c=0;
		}
		System.out.println(r);
	}
}