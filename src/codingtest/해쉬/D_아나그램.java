package codingtest.해쉬;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D_아나그램 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(solution(s1, s2));
		
		sc.close();
	}

	private static String solution(String s1, String s2) {
		String result = "";
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : s2.toCharArray()) {
			if(map.getOrDefault(ch, 0) > 0) {
				map.put(ch, map.get(ch)-1);
			}
		}
		
		if(map.values().stream().allMatch(count -> count == 0))
			result = "YES";
		else result = "NO";
		
		return result;
	}
	
}
