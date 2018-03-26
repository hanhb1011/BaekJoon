import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n[]=new int[101], N=sc.nextInt(),M=sc.nextInt();
		while(M-->0) {
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			for(int i=a;i<=b;i++)
				n[i]=c;
		}
		for(int i=1;i<=N;i++)
			System.out.print(n[i]+" ");
	}
}