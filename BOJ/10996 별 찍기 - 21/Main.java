import java.util.*;

public class Main{
	public static void main(String[] args){
		int N=new Scanner(System.in).nextInt();
		for(int i=0;i<N*2;i++) {
			for(int j=0;j<N;j++)
				System.out.print(i%2==0?(j%2==0?"*":" "):(j%2==0?" ":"*"));
			System.out.println();
		}
	}
}