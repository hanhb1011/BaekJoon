import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int []color = new int[4];
		int []number = new int[10];
		int maxScore = 0;
		for(int i=0; i<5; i++) {
			String s = scanner.next();
			int num = scanner.nextInt();
			number[num]++;
			switch(s){
			case "R" : color[0]++; break;
			case "B" : color[1]++; break;
			case "Y" : color[2]++; break;
			case "G" : color[3]++; break;
			}
		}

		for(int i=0; i<4; i++) {
			if(color[i]==5) {
				
				int continuousCnt = 0;
				int lastIndex=0;
				for(int j=1; j<=9; j++) {
					if(number[j]==1) {
						lastIndex = j;
						continuousCnt++;
					}
					else
						continuousCnt = 0;
					if(continuousCnt == 5) {
						maxScore = Math.max(maxScore, 900 + j);
					}
				}
				maxScore = Math.max(maxScore, 600 + lastIndex);
			}
		}

		if(maxScore < 900) {
			//
			int continuousCnt = 0;
			int maxIndex = 0;
			for(int i=0; i<=9; i++) {
				if(number[i] == 4) {
					maxScore = Math.max(maxScore, 800+i);
				} else if(number[i] ==3) {
					for(int j=0; j<=9; j++) {
						if(j==i)
							continue;
						else if(number[j]==2) {
							maxScore = Math.max(maxScore, i*10 + j + 700);
						}
					}
					maxScore = Math.max(maxScore,400 + i);
				} else if(number[i] ==2) {
					for(int j=0; j<=9; j++) {
						if(j==i)
							continue;
						else if(number[j]==2) {
							maxScore = Math.max(maxScore, i*10 + j + 300);
							
						}
					}
					maxScore = Math.max(maxScore, 200+i);
				}

				if(number[i]==1) {
					continuousCnt++;
					maxIndex = i;
				} else
					continuousCnt=0;
				if(continuousCnt ==5) {
					maxScore = Math.max(maxScore, i + 500);
				}


			}

			maxScore = Math.max(maxScore, maxIndex + 100);
		}


		System.out.println(maxScore);


	}
}




