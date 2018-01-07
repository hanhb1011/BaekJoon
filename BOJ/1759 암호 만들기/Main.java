import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static String str = "aeiou";
	static char[] chars;
	static int L,C;

	static void recur(int idx, int cn, char[] chrs) {
		chrs[cn] = chars[idx];
		if(cn==L-1) {
			boolean b = false;
			int count = 0;
			for(int i=0; i<L; i++) {
				boolean bb = false;
				for(int j=0; j<5; j++)
					if(str.charAt(j) == chrs[i]) {
						bb = true;
						b = true;
					}
				if(!bb) {
					count++;
				}
			}
			if(b && count>=2)
				sb.append(String.valueOf(chrs)).append("\n");
			return;
		}
		for(int i=idx+1; i<C; i++)
			recur(i, cn+1, chrs);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		L = scanner.nextInt();
		C = scanner.nextInt();
		chars = new char[C];
		for(int i=0; i<C; i++)
			chars[i] = scanner.next().charAt(0);
		Arrays.sort(chars);
		for(int i=0; i<=C-L; i++)
			recur(i, 0, new char[L]);

		System.out.println(sb);
	}
}