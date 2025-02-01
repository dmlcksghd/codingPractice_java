package 백준.정렬;

import java.io.*;
import java.util.*;

public class 수_찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr1, arr2));
    }

    private static StringBuilder solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);  // 4 1 5 2 3 -> 1 2 3 4 5

        StringBuilder sb = new StringBuilder();
        for (int num : arr2) {
            int idx = Arrays.binarySearch(arr1, num);
            if (idx >= 0) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }

        return sb;
    }
}