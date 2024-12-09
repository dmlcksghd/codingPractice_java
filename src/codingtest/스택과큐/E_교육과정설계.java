package codingtest.스택과큐;

import java.util.*;

public class E_교육과정설계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String preMajor = sc.nextLine();
		String s = sc.nextLine();
		
		System.out.println(solution(preMajor, s));
		
		sc.close();
	}

	private static String solution(String preMajor, String s) {
		String result="YES";
		Queue<Character> queue = new LinkedList<>();
		
		for(char ch : preMajor.toCharArray()) queue.offer(ch);
		
		for(char ch : s.toCharArray()) {
			if(queue.contains(ch) && ch!=queue.poll()) result="NO";
		}
		if(!queue.isEmpty()) result="NO";
		return result;
	}

}
