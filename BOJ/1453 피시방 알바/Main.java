import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), a[]=new int[101],r=0;
		while(N-->0){
			int n=sc.nextInt();
			if(a[n]==1) r++;
			else a[n]=1;
		}
		System.out.println(r);
	}
}