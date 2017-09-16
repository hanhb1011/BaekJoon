import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int [] alphabet = new int[26];
		for(int i=0; i<input.length(); i++)
			alphabet[input.charAt(i)-97]++;
		for(int i=0; i<alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
		
	}
}