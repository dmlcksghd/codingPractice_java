package codingtest;

import java.util.Scanner;

public class A3_1 {

	public static void main(String[] args) {
		// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println(solution(input));
		sc.close();
	}

	private static String solution(String input) {
		String result = "";
		int m = Integer.MIN_VALUE, pos;
		while((pos = input.indexOf(" ")) != -1) {
			String tmp = input.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m = len;
				result = tmp;
			}
			input = input.substring(pos+1);
		}
		if(input.length() > m) result = input;
		return result;
	}

}
