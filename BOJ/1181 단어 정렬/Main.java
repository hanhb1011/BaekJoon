import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		//override > 조건에 맞는 compareTo() 
		class Word implements Comparable<Word>{
			String word;
			
			public Word(String word) {
				this.word = word;
			}

			public int length() {
				// TODO Auto-generated method stub
				return word.length();
			}
			
			public int compareTo(Word w) {
				if(word.length() > w.length())
					return 1;
				else if(word.length() < w.length())
					return -1;
				else {
					return word.compareTo(w.word);
				}
				
			};
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return word;
			}
		}
		
		Word [] words = new Word[N];
		for(int i=0; i<N; i++)
			words[i] = new Word(scanner.next());
		Arrays.sort(words);
		StringBuilder result = new StringBuilder(1000000);
		result.append(words[0] + "\n");
		for(int i=1; i<N; i++) {
			if(words[i-1].compareTo(words[i])==0)
				continue;
			result.append(words[i] + "\n");
		}
		System.out.println(result);
		
		
	}
}