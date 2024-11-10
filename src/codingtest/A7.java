package codingtest;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	}

	private static String solution(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(reversed)) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
