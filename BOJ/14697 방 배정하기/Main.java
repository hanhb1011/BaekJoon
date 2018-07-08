import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
		for(int i=0;i<=n/a+1;i++)
			for(int j=0;j<=n/b+1;j++)
				for(int k=0;k<=n/c+1;k++)
					if(a*i+b*j+c*k==n) {
						System.out.println(1);
						return;
					}
		System.out.println(0);
	}
}