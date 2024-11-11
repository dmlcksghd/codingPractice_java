package codingtest.문자열;

import java.util.Scanner;

public class A_암호_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		System.out.println(solution(N, str));
		sc.close();
	}

	private static String solution(int n, String str) {
		  String result = "";
		  for(int i=0; i<n; i++) {
			  String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
			  int num = Integer.parseInt(tmp, 2);
			  result += (char)num;
			  str = str.substring(7);
		  }
		  return result;
	}
}
