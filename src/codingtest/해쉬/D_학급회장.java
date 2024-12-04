package codingtest.해쉬;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D_학급회장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		
		System.out.println(solution(n, s));
		
		sc.close();
	}

	private static char solution(int n, String s) {
		Map<Character, Integer> map = new HashMap<>();
		char result = ' ';
		int max = 0;
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				result = key;
			}
		}
		return result;
	}

}
