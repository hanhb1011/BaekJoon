import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for(int t=0; t<T; t++) {
			ArrayDeque<Integer> queue = new ArrayDeque<>();
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int count = 0;
			for(int i=0; i<N; i++)
				queue.add(scanner.nextInt());

			while(!queue.isEmpty()) {
				int head = queue.peek();
				int max = Integer.MIN_VALUE;
				Iterator<Integer> it = queue.iterator();
				while(it.hasNext()) {
					int n = it.next();
					max = n > max ? n : max;
				}

				if(max == head) {
					count++;
					if(M==0)
						break;
					else
						M--;
					queue.poll();
				} else {
					if(M==0)
						M=queue.size()-1;
					else
						M--;
					queue.add(queue.poll());
				}
			}
			System.out.println(count);
		}
	}
}