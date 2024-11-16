package codingtest.배열;

import java.util.Scanner;

public class B_등수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
		
		sc.close();
	}

	private static int[] solution(int n, int[] arr) {
		int[] result = new int[n];
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			for(int j=0; j<n; j++) {
				if(arr[i] < arr[j]) { rank++; }
			}
			result[i] = rank;
		}
		return result;
	}

}
