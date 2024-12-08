package codingtest.스택과큐;

import java.util.*;

public class E_후위식연산 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(solution(s));
		
		sc.close();
	}

	private static int solution(String s) {
		int result=0;
		Stack<Integer> stack = new Stack<>();
		
		for(char ch : s.toCharArray()) {
			if(Character.isDigit(ch)) stack.push(ch-48);
			else {
				int rt=stack.pop();
				int lt=stack.pop();
				switch (ch) {
                case '+':
                    stack.push(lt + rt);
                    break;
                case '-':
                    stack.push(lt - rt);
                    break;
                case '*':
                    stack.push(lt * rt);
                    break;
                case '/':
                    stack.push(lt / rt);
                    break;
            }
			}
		}
		result=stack.pop();
		return result;
	}
}
