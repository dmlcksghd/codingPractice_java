package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class A4 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int N = Integer.parseInt(sc.nextLine());
		
		String[] strArr = new String[N];
		for(int i=0; i<N; i++) {
			strArr[i] = sc.nextLine();
		}
		
		for(String result : solution(N, strArr)) {
			System.out.println(result);
		}
		
		sc.close();
	}

	private static ArrayList<String> solution(int N, String[] strArr) {
		ArrayList<String> results = new ArrayList<>();
		
		for(String str : strArr) {
			String tmp = new StringBuilder(str).reverse().toString();
			results.add(tmp);
		}
		
		return results;
	}

}
