package 백준.정렬;

import java.io.*;
import java.util.*;

public class 회의실_배정 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int[][]  meetings = new int[n][2];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, meetings));
    }

    private static int solution(int n, int[][] meetings) {
        Arrays.sort(meetings, (o1, o2) -> {
           if (o1[1] == o2[1]) return o1[0] - o2[0];
           return o1[1] - o2[1];
        });

        int cnt = 0;
        int endTime = 0;

        for (int[] meeting : meetings) {
            if (meeting[0] >= endTime) {
                cnt++;
                endTime = meeting[1];
            }
        }

        return cnt;
    }
}
