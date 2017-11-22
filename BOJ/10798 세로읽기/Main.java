import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String []inputs = new String[5];
		for(int i=0; i<5; i++)
			inputs[i] = scanner.next(); 

		StringBuilder result = new StringBuilder();

		for(int i=0; i<15; i++)
			for(int j=0; j<5; j++)
				try {
					result.append(inputs[j].charAt(i));
				} catch(Exception e) {}
		System.out.println(result);

	}
}

