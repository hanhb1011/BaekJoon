import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int [] n = {300,60,10};
		int [] result = {0,0,0};
		for(int i=0; i<3; i++)
			while(t>=n[i]) {
				t-=n[i];
				result[i]++;
			}
		if(t!=0)
			System.out.println(-1);
		else
			for(int i=0;i<3;i++)
				System.out.print(result[i] + " ");
	}
}

