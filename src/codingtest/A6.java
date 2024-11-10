package codingtest;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 String str = sc.nextLine();
		 
		 System.out.println(solution(str));
		 
		 sc.close();
	}

	private static String solution(String str) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				result += str.charAt(i);
			}
		}
		return result;
	}

}
