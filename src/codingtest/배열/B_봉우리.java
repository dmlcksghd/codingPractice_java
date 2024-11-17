package codingtest.배열;

import java.util.Scanner;

public class B_봉우리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(solution(n, arr));

		sc.close();
	}

	private static int solution(int n, int[][] arr) {
		int result = 0;
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;                                    
				for(int k=0; k<n; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) result++;
			}
		}
		
		return result;
	}

}
