package codingtest.스택과큐;

import java.util.*;

public class E_괄호문자제거 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
		
		sc.close();
	}

	private static String solution(String s) {
		String result = "";
		Stack<Character> stack = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			if(ch==')') {
				while(stack.pop()!='(');
			}
			else stack.push(ch);
		}
		
		for(int i=0; i<stack.size(); i++) result += stack.get(i);
		return result;
	}

}
