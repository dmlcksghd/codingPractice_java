package codingtest.배열;

import java.util.Scanner;

public class B_임시반장정하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[n + 1][6];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(solution(n, arr));
		sc.close();
	}

	private static int solution(int n, int[][] arr) {
		int result = 0, max = 0;

		for (int student1 = 1; student1 <= n; student1++) {
			int cnt = 0;
			for (int student2 = 1; student2 <= n; student2++) {
				for (int grade = 1; grade <= 5; grade++) {
					if (arr[student1][grade] == arr[student2][grade]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				result = student1;
			}
		}

		return result;
	}

}
