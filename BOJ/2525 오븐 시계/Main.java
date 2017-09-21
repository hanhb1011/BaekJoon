import java.util.Scanner;

public class Main {
	
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int []i = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		System.out.println((i[2]%60+i[1] >= 60 ? (i[0]+i[2]/60+1)%24 : (i[0]+i[2]/60)%24) + " " + ((i[2]%60+i[1])%60));
	}
}