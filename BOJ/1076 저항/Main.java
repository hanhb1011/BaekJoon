import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String []res = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		String []inputs = {scanner.next(),scanner.next(),scanner.next()};

		long result = 0;
		for(int n=0;n<3;n++) {
			long val = 0;
			for(int i=0; i<res.length; i++) {
				if(inputs[n].equals(res[i])) {
					if(n==2) 
						result*=Math.pow(10, i);
					else 
						result+=i*Math.pow(10, n==0?1:0);
					break;
				}
			}
		}
		System.out.println(result);
	}
}

