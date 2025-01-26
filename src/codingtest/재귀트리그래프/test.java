package codingtest.재귀트리그래프;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		for (int i=0; i<n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		for (int x : solution(n, num)) {
			bw.write(x + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	private static int[] solution(int n, int[] num) {
		Arrays.sort(num);
		
		return num;
	}

}
