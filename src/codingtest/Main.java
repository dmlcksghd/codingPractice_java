package codingtest;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] people = new int[n][2];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(solution(n, people));

		br.close();
	}

	private static String solution(int n, int[][] people) {
		int[] ranks = new int[n];
		StringBuilder sb = new StringBuilder();
		
		Arrays.fill(ranks, 1);
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i == j) continue;
				if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
					ranks[i]++;
				}
			}
		}
		
		for (int rank : ranks) sb.append(rank).append(" ");
		
		return sb.toString();
	}

}
