package codingtest;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char ch = sc.nextLine().charAt(0);

		System.out.println(solution(str, ch));
		
		sc.close();
	}

	private static int solution(String str, char ch) {
		int result = 0;

		str = str.toUpperCase();
		ch = Character.toUpperCase(ch);

		for (char word : str.toCharArray()) {
			if (word == ch)
				result++;
		}

		return result;
	}
}
//Computercooler
//c

