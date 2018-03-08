import java.util.*;
public class Main{
	public static void main(String[] args){
		for(char c : new Scanner(System.in).nextLine().toCharArray())
			System.out.print(c<123 && c>96 ? (char)((c-84)%26+97) : c>64 && c<91 ? (char)((c-52)%26+65) : c);
	}
}