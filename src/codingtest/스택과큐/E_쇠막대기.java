package codingtest.스택과큐;

import java.util.*;

public class E_쇠막대기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
		
		sc.close();
	}

	private static int solution(String s) {
		int result = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(s.charAt(i-1)=='(') result+=stack.size();
				else result++;
			}
		}
		
		
		return result;
	}

}
