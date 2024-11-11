package codingtest.문자열;

import java.util.Scanner;

public class A_문자열압축 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(solution(str));

		sc.close();
	}

	//KKHSSSSSSSE
	private static String solution(String str) {
		String result = "";
		str = str + " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				result += str.charAt(i);
				if(cnt>1) result += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return result;
	}

}
