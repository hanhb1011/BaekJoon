import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		class Loc implements Comparable<Loc>{
			int x; int y;  public Loc(int x, int y) { this.x = x; this.y = y; }
			public int compareTo(Loc l) {
				if(x>l.x) return 1;
				else if(x<l.x) return -1;
				else {
					if(y>l.y)
						return 1;
					else if(y<l.y)
						return -1;
					else 
						return 0;
				}
			}
		}
		StringBuilder result = new StringBuilder(T*4);
		PriorityQueue<Loc> queue = new PriorityQueue<>(T);
		for(int i=0; i<T; i++)
			queue.add(new Loc(scanner.nextInt(), scanner.nextInt()));
		while(!queue.isEmpty()) {
			Loc l = queue.poll();
			result.append(l.x + " " + l.y + "\n");
		}
		System.out.println(result);
	}
}
