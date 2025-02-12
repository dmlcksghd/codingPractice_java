package 백준.정렬;

import java.io.*;
import java.util.*;

public class 커트라인{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Integer[] scores = new Integer[n];
        for (int i=0; i<n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores, Collections.reverseOrder());

        System.out.println(scores[k - 1]);

        br.close();
    }

}
