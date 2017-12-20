import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []menu = new int[5];
		int minA=Integer.MAX_VALUE, minB=Integer.MAX_VALUE;
		for(int i=0; i<5; i++) {
			menu[i] = scanner.nextInt();
			if(i<=2)
				minA = minA < menu[i] ? minA : menu[i];
			else 
				minB = minB < menu[i] ? minB : menu[i];
		}
		System.out.println(minA+minB-50);
	}
}

