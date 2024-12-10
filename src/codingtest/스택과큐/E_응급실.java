package codingtest.스택과큐;

import java.util.*;

public class E_응급실 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
		
		sc.close();
	}

	private static int solution(int n, int m, int[] arr) {
		int result=1;
		Queue<Person> queue = new LinkedList<>();
		for(int i=0; i<n; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		while(!queue.isEmpty()) {
			Person tmp=queue.poll();
			for(Person p : queue) {
				if(p.priority>tmp.priority) {
					queue.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				if(tmp.id==m) return result;
				else result++;
			}
		}
		return result;
	}
	
	static class Person {
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id=id;
			this.priority=priority;
		}
	}

}
