import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println(a+b+c!=180?"Error":a==60&&b==60&&c==60?"Equilateral":a==b||b==c||c==a?"Isosceles":"Scalene");
	}
}