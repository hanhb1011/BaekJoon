import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		StringBuilder result = new StringBuilder();
		class Person implements Comparable<Person>{
			int index;
			int age;
			String name;
			public Person(int index, int age, String name) {
				this.index = index;
				this.age = age;
				this.name = name;
			}
			
			public int compareTo(Person o) {
				if(age > o.age)
					return 1;
				else if(age < o.age)
					return -1;
				else {
					if(index > o.index)
						return 1;
					else if(index < o.index)
						return -1;
					else
						return 0;
				}
			};
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return age + " " + name + "\n";
			}
		}
		Person []people = new Person[N];
		for(int i=0; i<N; i++)
			people[i] = new Person(i, scanner.nextInt(), scanner.next());
		
		Arrays.sort(people);
		
		for(int i=0; i<N; i++)
			result.append(people[i]);
		
		System.out.println(result);
	}
}
