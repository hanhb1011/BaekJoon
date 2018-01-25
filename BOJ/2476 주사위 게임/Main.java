import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), max = 0;
		
		for(int i=0;i<N;i++) {
			int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(), p;
			if(a==b&&b==c) p = 10000+a*1000;
			else if(a==b||b==c||c==a) p = c==a?1000+c*100:1000+b*100;	
			else p = a>b?c>a?c*100:a*100:b>c?b*100:c*100;
			max = max > p ? max : p;
		}
		System.out.println(max);
	}
}