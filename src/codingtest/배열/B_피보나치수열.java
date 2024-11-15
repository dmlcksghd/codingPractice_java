package codingtest.배열;

import java.util.Scanner;

public class B_피보나치수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x : solution(n)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n) {
		int[] result = new int[n];
		
		result[0] = 1;
		result[1] = 1;
		for(int i=2; i<n; i++) {
			result[i] = result[i-2] + result[i-1];
		}
		
		return result;
	}


}
