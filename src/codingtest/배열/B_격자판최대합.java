package codingtest.배열;

import java.util.Scanner;

public class B_격자판최대합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n]; 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
		
		sc.close();
	}
	
	private static int solution(int n, int[][] arr) {
		int result = 0;
		int sumDiagonal1 = 0, sumDiagonal2 = 0;
		
		for(int i=0; i<n; i++) {
			int row = 0, col = 0;
			for(int j=0; j<n; j++) {
				row += arr[i][j];
				col += arr[j][i];
			}
			sumDiagonal1 += arr[i][i];
			sumDiagonal2 += arr[i][n - i - 1];
			
			result = Math.max(result, Math.max(row, col));
		}
		result = Math.max(result, Math.max(sumDiagonal1, sumDiagonal2));
		
		return result;
	}

}
