package codingtest.sortingAndSearching;

import java.io.*;
import java.util.*;

public class F_마구간정하기결정알고리즘 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, c, arr));
	}

	private static int solution(int n, int c, int[] arr) {
		int result = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) >= c) {
				result = mid;
				lt = mid + 1;
			}
			else rt = mid - 1;
	}
		return result;
	}
	
	private static int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] - ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}

}
