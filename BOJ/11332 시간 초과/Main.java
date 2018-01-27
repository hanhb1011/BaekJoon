import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int C =sc.nextInt();
		sc.nextLine();
		for(int c=0; c<C; c++) {
			String s = sc.next();
			long n = sc.nextInt(), t = sc.nextInt(), l = sc.nextInt()*100000000, num=1;
			boolean passed = true;
			
			if(s.charAt(2)=='2') {
				for(int i=0; i<n; i++) {
					num<<=1;
					if(num*t>l) {
						passed=false;
						break;
					}
				}
			} else if(s.length()==5) {
				for(int i=(int)n; i>0; i--) {
					num*=i;
					if(num*t>l) {
						passed=false;
						break;
					}
				}
			} else if(s.length()>4 && (s.charAt(4)=='2' || s.charAt(4)=='3')) {
				int op = Integer.parseInt(s.substring(4, 5));
				for(int i=0; i<op; i++) {
					num*=n;
					if(num*t>l) {
						passed=false;
						break;
					}
				}
			}

			if(passed)
				sb.append("May Pass.\n");
			else
				sb.append("TLE!\n");
		}
		System.out.println(sb);
	}
}