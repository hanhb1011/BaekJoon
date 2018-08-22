import java.util.*;

public class Main{
	static int res;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int T=Integer.valueOf(sc.nextLine());
		while(T-->0){
			StringBuffer s=new StringBuffer(sc.nextLine());
			s.replace(0, 1, s.substring(0, 1).toUpperCase());
			System.out.println(s);
		}
	}
}