package codingtest.스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solution(n, m, arr));

		sc.close();
	}

	private static int solution(int n, int m, int[] arr) {
		int result = 1;
		Queue<Person> queue = new LinkedList<>();

		for (int i = 0; i < n; i++)
			queue.offer(new Person(i, arr[i]));

		while (!queue.isEmpty()) {
			Person tmp = queue.poll();
			for (Person p : queue) {
				if (p.preority > tmp.preority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				if (tmp.id == m)
					return result;
				else
					result++;
			}
		}
		return result;
	}

	private static class Person {
		int id;
		int preority;
		public Person(int id, int preority) {
			this.id = id;
			this.preority = preority;
		}
	}
}
