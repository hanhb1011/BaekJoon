import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int [] inputs = new int[6];
		for(int i=0; i<6; i++)
			inputs[i] = scanner.nextInt();
		int count = 0;
		for(int i=1; i<6; i++)
			if(inputs[0]==inputs[i])
				count++;
		System.out.println(count);
	}
}