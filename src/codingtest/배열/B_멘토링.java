package codingtest.배열;

import java.util.Scanner;

public class B_멘토링 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 테스트 횟수

        int[][] arr = new int[m][n]; // 테스트 결과 배열
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
        sc.close();
    }

    private static int solution(int n, int m, int[][] arr) {
        int result = 0;

        // 각 학생의 테스트별 등수 저장
        int[][] rank = new int[m][n + 1];
        for (int test = 0; test < m; test++) {
            for (int pos = 0; pos < n; pos++) {
                rank[test][arr[test][pos]] = pos;
            }
        }

        // 모든 멘토-멘티 쌍 확인
        for (int mentor = 1; mentor <= n; mentor++) {
            for (int mentee = 1; mentee <= n; mentee++) {
                if (mentor == mentee) continue;

                boolean validPair = true;
                for (int test = 0; test < m; test++) {
                    if (rank[test][mentor] >= rank[test][mentee]) {
                        validPair = false;
                        break;
                    }
                }

                if (validPair) {
                    result++;
                }
            }
        }

        return result;
    }

}
