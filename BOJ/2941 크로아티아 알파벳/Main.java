import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int count=0;
		String [] alpha = {"c=", "c-", "d-", "lj", "nj", "s=", "z=", "dz="};
		
		for(int i=0; i<str.length(); i++) {

			if(i+2<str.length()) {
				if(str.substring(i, i+3).equals(alpha[7])) {
					count++; i=i+2;
					continue;
				}
			}

			if(i+1<str.length()) {
				boolean isCroa = false;
				for(int j=0; j<7; j++) {
					if(str.substring(i, i+2).equals(alpha[j])) {
						isCroa=true;
						break;
					}
				}
				if(isCroa) {
					i++;
				} 
			}
			count++;
		}
		
		System.out.println(count);
	}

}
