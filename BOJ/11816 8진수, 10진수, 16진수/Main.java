import java.util.*;
public class Main{
	public static void main(String[] args){
		String s = new Scanner(System.in).next();
		System.out.println(s.charAt(1)=='x'?Integer.valueOf(s.substring(2, s.length()), 16):s.charAt(0)=='0'?Integer.valueOf(s.substring(1, s.length()), 8):s);
	}
}