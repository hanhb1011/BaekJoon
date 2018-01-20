import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int ax = sc.nextInt(), ay = sc.nextInt(), bx = sc.nextInt(), by = sc.nextInt(), cx = sc.nextInt(), cy = sc.nextInt()
				, ccw = ax*by+bx*cy+cx*ay-ay*bx-by*cx-cy*ax;
		System.out.println(ccw > 0 ? 1 : ccw == 0 ? 0 : -1);
		
	}
}