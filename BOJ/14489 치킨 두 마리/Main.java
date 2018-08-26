import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt()*2;
		System.out.println((a+b)<c?(a+b):(a+b-c));
	}
}