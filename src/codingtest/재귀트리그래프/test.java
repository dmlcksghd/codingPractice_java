package codingtest.재귀트리그래프;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[n];
		for (int i=0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());
		
		int totalTime = solution(n, num);
		System.out.println(totalTime);
		
		br.close();
	}

	private static int solution(int n, int[] num) {
		Arrays.sort(num);
		
		int totalTime = 0;
		int accumulatedTime = 0;
		for (int time : num) {
            accumulatedTime += time; // 현재 사람의 대기 시간
            totalTime += accumulatedTime; // 총 소요 시간에 더하기
        }
		
		return totalTime;
	}

}
