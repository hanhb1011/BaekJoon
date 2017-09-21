import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		ArrayList<Integer> list = new ArrayList<>();

		boolean start = false;
		for(int i=9; i>=0; i--) {
			int tok = (int) ((N/Math.pow(10, i))%10);
			if(tok==0 && !start)
				continue;
			else
				start = true;
			list.add(tok);
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1 < o2)
					return 1;
				else if(o1 > o2)
					return -1;
				else
					return 0;
			}
		});
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i));
	}
}