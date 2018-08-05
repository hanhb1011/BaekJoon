import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int []a=Arrays.stream(new int[9]).map(i->sc.nextInt()).toArray();
		for(int i=0;i<8;i++)
			for(int j=i+1;j<9;j++) {
				int s=0;
				for(int k=0;k<9;k++)
					if(k!=i&&k!=j)
						s+=a[k];
				if(s==100)
					for(int k=0;k<9;k++)
						if(k!=i&&k!=j)
							System.out.println(a[k]);
			}
	}
}