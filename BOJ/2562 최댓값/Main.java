import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[9];
		for(int i=0; i<9; i++)
			num[i] = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for(int i=0; i<9; i++) {
			if(max < num[i]) {
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println(max+"\n"+ (maxIndex+1));
	}
}