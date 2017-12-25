import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []n = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		
		if(n[0]==n[1] && n[1]==n[2])
			System.out.println((10000+n[0]*1000));
		else if(n[0]==n[1] || n[0]==n[2] || n[1]==n[2])
			System.out.println((1000+100*(n[0]==n[1] ? n[0] : n[2])));
		else
			System.out.println((n[0]>n[1]?(n[0]>n[2]?n[0]:n[2]):(n[1]>n[2]?n[1]:n[2]))*100);
	}
}

