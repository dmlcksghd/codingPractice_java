package codingtest.sortingAndSearching;

import java.util.*;

public class F_장난꾸러기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		for(int x : solution(n, arr)) {
			System.out.print(x + " ");
		}

		sc.close();
	}
	
	private static ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for (int i=0; i<n; i++) {
			if(arr[i] != tmp[i]) result.add(i+1);
		}
		return result;
	}

}
