package codingtest;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	}

	private static String solution(String str) {
		String newStr = "";
		for(char word : str.toCharArray()) {
			// Upper Lower 사용해서 변환
			/*if(Character.isUpperCase(word)) {
				newStr += Character.toLowerCase(word);
			} else {
				newStr += Character.toUpperCase(word);
			}*/
			
			// 아스키 사용해서 변환
		}
		return newStr;
	}

}
