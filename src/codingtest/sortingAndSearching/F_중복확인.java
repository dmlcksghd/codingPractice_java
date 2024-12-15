package codingtest.sortingAndSearching;

import java.util.*;

public class F_중복확인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, arr));
		
		sc.close();
	}

	private static String solution(int n, int[] arr) {
		String result = "U";
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(int key : map.keySet()) {
			if(map.get(key) > 1) {
				result = "D";
				break;
			}
		}
		return result;
	}

}
