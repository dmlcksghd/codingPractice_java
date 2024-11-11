package codingtest.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class B_큰수출력하기 {

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

	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) result.add(arr[i]);
		}
		return result;
	}
}
