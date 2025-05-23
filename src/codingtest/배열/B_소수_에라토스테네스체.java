package codingtest.배열;

import java.util.Scanner;

public class B_소수_에라토스테네스체 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
		
		sc.close();
	}

	private static int solution(int n) {
		int result = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i] == 0) {
				result++;
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		return result;
	}

}
