import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[201];
		int N=sc.nextInt();
		while(N-->0)
			a[sc.nextInt()+100]++;
		System.out.println(a[sc.nextInt()+100]);
	}
}