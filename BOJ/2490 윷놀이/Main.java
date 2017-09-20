import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			int zeroCount = 0;
			int [] inputs = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
			for(int x : inputs)
				if(x==0)
					zeroCount++;
			
			if(zeroCount == 1)
				System.out.println("A");
			else if(zeroCount == 2)
				System.out.println("B");
			else if(zeroCount == 3)
				System.out.println("C");
			else if(zeroCount == 4)
				System.out.println("D");
			else
				System.out.println("E");
		}
	}
}
