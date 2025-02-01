package 백준.정렬;

import java.util.*;
import java.io.*;

public class 좌표_정렬하기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] sorted = solution(arr);
        for (int i=0; i<n; i++) {
            System.out.println(sorted[i][0] + " " + sorted[i][1]);
        }
    }

    private static int[][] solution(int[][] arr) {
        Arrays.sort(arr, (o1, o2) -> {
           if (o1[1] == o2[1]) return o1[0] - o2[0];
           return o1[1] - o2[1];
        });

        return arr;
    }
}
