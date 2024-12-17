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
		Set<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(!set.add(num)) return "D";
		}
		return "U";
	}

}
