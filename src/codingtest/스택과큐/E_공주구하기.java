package codingtest.스택과큐;

import java.util.*;

public class E_공주구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(solution(n, k));
		
		sc.close();
	}

	private static int solution(int n, int k) {
		int result=0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++) queue.offer(i);
		while(!queue.isEmpty()) {
			for(int i=1; i<k; i++) queue.offer(queue.poll());
			queue.poll();
			if(queue.size()==1) result=queue.poll();
		}
		
		return result;
	}
}
