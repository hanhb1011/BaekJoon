import java.util.*;

public class Main{
	public static void main(String[] args){
		int N=new Scanner(System.in).nextInt();
		if(N%2==0)
			System.out.println("I LOVE CBNU");
		else
			for(int i=0;i<N/2+2;i++) {
				for(int j=0;j<(i==0?N:N/2+i);j++)
					System.out.print(i==0||j==N/2+i-1||j==N/2-i+1?"*":" ");
				System.out.println();
			}
	}
}