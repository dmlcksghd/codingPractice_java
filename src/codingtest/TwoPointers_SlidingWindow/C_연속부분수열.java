package codingtest.TwoPointers_SlidingWindow;

import java.util.Scanner;

public class C_연속부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
		
		sc.close();
	}

	private static int solution(int n, int m, int[] arr) {
		int result = 0;
		int sum = 0;
		int lt = 0;
		
		for (int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if (sum == m) result++;
			
			while (sum >= m) {
				sum -= arr[lt++];
				if (sum == m) result++;
			}
		}
		
		return result;
	}

}
