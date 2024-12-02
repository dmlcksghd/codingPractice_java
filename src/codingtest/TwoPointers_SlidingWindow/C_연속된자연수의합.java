package codingtest.TwoPointers_SlidingWindow;

import java.util.Scanner;

public class C_연속된자연수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		int result = 0, sum = 0, lt = 0;
		int m = n / 2 + 1;
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) arr[i] = i + 1;
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum==n) result++;
			while(sum>=n) {
				sum -= arr[lt++];
				if(sum==n) result++;
			}
		}
		return result;
	}

}
