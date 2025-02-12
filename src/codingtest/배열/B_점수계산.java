package codingtest.배열;

import java.util.Scanner;

public class B_점수계산 {
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
		int result = 0, cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				result += cnt;
			} else {
				cnt = 0;
			}
		}
		
		return result;
	}
}
