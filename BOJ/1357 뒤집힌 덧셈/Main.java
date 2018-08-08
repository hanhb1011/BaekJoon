import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuffer X=new StringBuffer(sc.next()).reverse(), Y=new StringBuffer(sc.next()).reverse();
		System.out.println(Integer.valueOf(new StringBuffer(String.valueOf(Integer.valueOf(X.toString())+Integer.valueOf(Y.toString()))).reverse().toString()));
	}
}