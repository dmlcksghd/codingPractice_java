package codingtest.문자열;

import java.util.Scanner;

public class A_특정문자뒤집기 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String str = sc.nextLine();
		 
		 System.out.println(solution(str));
		 
		 sc.close();
	}

	private static String solution(String str) {
		char[] chArr = str.toCharArray();
		int start = 0, end = chArr.length - 1;
		
		while(start < end) {
			if (Character.isLetter(chArr[start]) && Character.isLetter(chArr[end])) {
				char tmp = chArr[start];
				chArr[start] = chArr[end];
				chArr[end] = tmp;
				
				start++; end--;
			} else if(!Character.isLetter(chArr[start])) {
				start++;
			} else if(!Character.isLetter(chArr[end])) {
				end--;
			}
		}
		return String.valueOf(chArr);
	}

}
