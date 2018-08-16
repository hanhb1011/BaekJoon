import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		double c[]= {350.34,230.9,190.55,125.3,180.9};
		while(T-->0) {
			double s=0;
			for(int i=0;i<5;i++)
				s+=sc.nextInt()*c[i];
			System.out.println("$"+String.format("%.2f", s));
		}
	}
}