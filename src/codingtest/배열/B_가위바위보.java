package codingtest.배열;

import java.util.Scanner;

public class B_가위바위보 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
        	System.out.println(solution(n, a, b).charAt(i));
        }
        
        sc.close();
    }

	// 1 -> 가위, 2 -> 주먹, 3 -> 보
	private static String solution(int n, int[] a, int[] b) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				result.append("D"); // 비김
			} else if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2)) {
				result.append("A"); // A이김
			} else {
				result.append("B"); // B이김
			}
		}

		return result.toString();
	}
}
