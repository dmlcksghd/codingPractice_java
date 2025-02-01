package 백준.정렬;

import java.util.*;
import java.io.*;

public class 좌표_정렬하기 {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                x[i] = Integer.parseInt(st.nextToken());
                y[i] = Integer.parseInt(st.nextToken());
            }

            int[][] sorted = solution(n, x, y);

            for (int i = 0; i < n; i++) {
                System.out.println(sorted[i][0] + " " + sorted[i][1]);
            }
    }

    private static int[][] solution(int n, int[] x, int[] y) {
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = x[i];
            arr[i][1] = y[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        return arr;
    }
}
