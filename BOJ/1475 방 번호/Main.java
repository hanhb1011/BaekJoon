import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		boolean start = false;
		double [] num = new double[9];
		for(int i=7; i>=0; i--) {
			if(!start && (int)(N/Math.pow(10, i))%10 == 0)
				continue;
			else
				start = true;

			if((int)(N/Math.pow(10, i))%10 == 6 || (int)(N/Math.pow(10, i))%10 == 9)
				num[6]+=0.5;
			else {
				num[(int) (N/Math.pow(10, i))%10]+=1;
			}
		}
		
		int result = 0;
		for(int i=0; i<9; i++) {
			if(result < (int)Math.round(num[i]))
				result = (int) Math.round(num[i]);
		}	
		System.out.println(result == 0 ? 1 : result);

	}

}
