import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int []num = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) 
			num[sc.nextInt()%42]++;
		for(int i=0; i<42; i++)
			count = num[i]!=0 ? count+1 : count;
		
		System.out.println(count);
	}
}