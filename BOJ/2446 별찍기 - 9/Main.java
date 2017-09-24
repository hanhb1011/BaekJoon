import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0; i<2*N-1; i++) {
			if(i<N) {
				for(int j=0; j<i; j++)
					System.out.print(" ");
				for(int j=0; j<(N*2-1-(i*2)); j++)
					System.out.print("*");
				
			} else {
				for(int j=0; j<(N-1)*2-i; j++)
					System.out.print(" ");
				for(int k=0; k<2*(i-N+1)+1; k++) {  
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
}


