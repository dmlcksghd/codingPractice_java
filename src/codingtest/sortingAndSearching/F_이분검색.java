package codingtest.sortingAndSearching;

import java.io.*;
import java.util.*;

public class F_이분검색 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 정리
		Arrays.sort(arr);
		
		System.out.println(solution(n, m, arr));
	}

	// 12 23 32 57 65 81 87 99
	private static int solution(int n, int m, int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (arr[mid] == m) return mid + 1;
			else if (arr[mid] < m) left = mid + 1;
			else right = mid - 1;
		}
		return -1;
	}

}
