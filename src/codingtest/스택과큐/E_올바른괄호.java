package codingtest.스택과큐;

import java.util.*;


public class E_올바른괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
		
		sc.close();
	}

	private static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if(ch=='(') stack.push(ch);
			else if(ch==')') {
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty() ? "YES" : "NO";
	}

}
