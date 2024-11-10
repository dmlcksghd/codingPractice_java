package codingtest.문자열;

import java.util.Scanner;

public class A_문장속단어_1 {

	public static void main(String[] args) {
		// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println(solution(input));
		sc.close();
	}

	private static String solution(String input) {
		String[] inputArr = input.split(" ");
		int result = 0;
		
		for(int i=1; i<inputArr.length; i++) {
			if(inputArr[i].length() > inputArr[result].length()) {
				result = i;
			}
		}
		return inputArr[result];
	}

}
