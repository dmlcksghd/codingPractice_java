package codingtest.해쉬;

import java.util.*;

public class D_모든아나그램찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(solution(s1, s2));
		
		sc.close();
	}

	private static int solution(String s1, String s2) {
		int result = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(char x : s2.toCharArray()) map2.put(x, map2.getOrDefault(x, 0)+1);
		
		int len = s2.length()-1;
		for(int i=0; i<len; i++) map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		
		int lt=0;
		for(int rt=len; rt<s1.length(); rt++) {
			map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0)+1);
			if(map1.equals(map2)) result++;
			map1.put(s1.charAt(lt), map1.get(s1.charAt(lt))-1);
			if(map1.get(s1.charAt(lt))==0) map1.remove(s1.charAt(lt));
			lt++;
		}
		
		return result;
	}

}
