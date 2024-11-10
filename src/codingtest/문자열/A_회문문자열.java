package codingtest.문자열;

import java.util.Scanner;

public class A_회문문자열 {

	public static void main(String[] args) {
		//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	}

	private static String solution(String str) {
		int len = str.length();
		str = str.toLowerCase();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				return "NO";
			} 
		}
		return "YES";
	}

}
