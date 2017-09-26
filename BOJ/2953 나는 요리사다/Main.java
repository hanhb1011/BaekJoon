import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int [][]scores = new int[5][5]; //마지막 인덱스에 합 저장
		for(int i=0; i<5; i++)
			for(int j=0; j<4; j++)
				scores[i][j] = scanner.nextInt();
		
		int winner = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				scores[i][4]+=scores[i][j];
			}
			if(scores[i][4] > scores[winner][4])
				winner = i;
		}
		
		System.out.println((winner+1) + " " + scores[winner][4]);
	}
}


