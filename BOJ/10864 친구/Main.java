import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l[]=new int[1001], N=sc.nextInt(),M=sc.nextInt();
		while(M-->0) {
			int a=sc.nextInt(),b=sc.nextInt();
			l[a]++;l[b]++;
		}
		for(int i=1;i<=N;i++)
			System.out.println(l[i]);
	}
}