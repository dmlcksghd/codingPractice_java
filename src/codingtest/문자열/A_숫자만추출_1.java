package codingtest.문자열;

import java.util.Scanner;

public class A_숫자만추출_1 {

	public static void main(String[] args) {
		/* 
		 *  문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.

			만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
		sc.close();
	}
	
	// g0en2T0s8eSoft
	private static int solution(String str) {
		StringBuilder strNum = new StringBuilder();
		for(char word : str.toCharArray()) {
			if(Character.isDigit(word)) {
				strNum.append(word);
			}
		}
		return Integer.parseInt(strNum.toString());
	}

}
