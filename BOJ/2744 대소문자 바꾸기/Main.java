import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), res="";
	
		for(int i=0; i<s.length(); i++)
			res += s.charAt(i)<=90 ? (char)(s.charAt(i)+32) : (char)(s.charAt(i)-32);
			
		System.out.println(res);
	}
	
}