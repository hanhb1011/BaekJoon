import java.util.*;
	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char []A = sc.nextLine().toCharArray(), B = sc.nextLine().toCharArray();
		int j=0, fail[]=new int[B.length], R[]=new int[1000000], ri=0;
		StringBuffer sb=new StringBuffer();
		
		for(int i=1;i<B.length;i++) {
			while(j>0 && B[i]!=B[j])
				j=fail[j-1];
			if(B[i]==B[j])
				fail[i] = ++j;
		}
		
		j=0;
		for(int i=0;i<A.length;i++) {
			while(j>0 && A[i]!=B[j])
				j=fail[j-1];
			if(A[i]==B[j]) {
				j++;
				if(j==B.length) {
					R[ri++] = i-j+2;
					j=fail[j-1];
				}
			} 		
		}
		sb.append(ri).append("\n");
		for(int i=0;i<ri;i++)
			sb.append(R[i]).append("\n");
		System.out.println(sb);
	}
}

