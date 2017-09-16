import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int [][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[i].length; j++)
				matrix[i][j] = scanner.nextInt();
		int K = scanner.nextInt();
		
		for(int k=0; k<K; k++) {
			int []inputs = {scanner.nextInt()-1, scanner.nextInt()-1, scanner.nextInt()-1, scanner.nextInt()-1};
			int sum=0;
			for(int i=inputs[0]; i<=inputs[2]; i++)
				for(int j=inputs[1]; j<=inputs[3]; j++)
					sum+=matrix[i][j];
			System.out.println(sum);
		}
		
	}
}