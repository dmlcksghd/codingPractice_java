package codingtest.문자열;

import java.util.Scanner;

public class A_암호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		System.out.println(solution(N, str));
		sc.close();
	}

	private static String solution(int n, String str) {
		StringBuilder result = new StringBuilder();
		str = str.trim();
		for(int i=0; i<str.length(); i+=7) {
			String ascii = str.substring(i, Math.min(i + 7, str.length()));
			
			String binary = ascii.replace('#', '1').replace('*', '0');
			
			char decode = (char)Integer.parseInt(binary, 2);
			
			result.append(decode);
		}  
		
		return result.toString();
	}

}
