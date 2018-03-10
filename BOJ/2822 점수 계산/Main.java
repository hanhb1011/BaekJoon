import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		class Num implements Comparable<Num>{ int n,k; Num(int a,int b){n=a;k=b;} public int compareTo(Num o) {return n-o.n;}}
		Num[] n=new Num[8];
		for(int i=0;i<8;i++)
			n[i]=new Num(sc.nextInt(),i+1);
		Arrays.sort(n);
		int s=0;
		List<Integer> l=new ArrayList<>();
		for(int i=3;i<8;i++) {
			s+=n[i].n;
			l.add(n[i].k);
		}
		l.sort((i,j)->i-j);
		System.out.println(s);
		for(int i:l)
			System.out.print(i+" ");
	}
}