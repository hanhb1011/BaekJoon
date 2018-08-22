import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			int N=sc.nextInt(), one=1, res=1;
			while(one%N!=0) {
				one=(one*10+1)%N;
				res++;
			}
			System.out.println(res);
		}
	}
}