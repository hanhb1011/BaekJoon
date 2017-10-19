import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		class Student implements Comparable<Student>{
			
			String name;
			int k;
			int e;
			int m;
			public Student(String name, int k, int e, int m) {
				this.name = name;
				this.k = k;
				this.e = e;
				this.m = m;
			}
			
			public int compareTo(Student s) {
				if(k > s.k) //조건 1
					return -1;
				else if( k < s.k)
					return 1;
				else { //조건 2
					if(e > s.e)
						return 1;
					else if(e < s.e)
						return -1;
					else { //조건 3
						if(m < s.m)
							return 1;
						else if(m > s.m)
							return -1;
						else { //조건 4
							return name.compareTo(s.name);
						}
					}
				}
			};
			
		}
		
		Student[] inputs = new Student[N];
		for(int i=0; i<N; i++)
			inputs[i] = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		Arrays.sort(inputs);
		
		StringBuilder result = new StringBuilder(10*N);
		for(int i=0; i<N; i++)
			result.append(inputs[i].name + "\n");
		
		System.out.println(result);
	}
}
