package codingtest.배열;

import java.util.Scanner;

public class B_보이는학생 {

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

	private static int solution(int n, int[] arr) {
		int cnt = 1, max = arr[0];
		for(int i=0; i<n-1; i++) {
			if(max < arr[i+1]) {
				max = arr[i+1];
				cnt++;
			}
		}
		return cnt;
	}

}
