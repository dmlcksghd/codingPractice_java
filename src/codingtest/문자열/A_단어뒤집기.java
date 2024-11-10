package codingtest.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class A_단어뒤집기 {

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
			char[] ch = str.toCharArray();
			int lt = 0, rt = str.length()-1;
			while(lt < rt) {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				
				lt++; rt--;
			}
			String tmp = String.valueOf(ch);
			results.add(tmp);
		}
		
		return results;
	}

}
