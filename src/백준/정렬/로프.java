package 백준.정렬;

import java.io.*;
import java.util.*;

public class 로프 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Integer[] ropes = new Integer[n];

        for (int i=0; i<n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes, Collections.reverseOrder());

        int maxWeight = 0;
        for (int i=0; i<n; i++) {
            maxWeight = Math.max(maxWeight, ropes[i] * (i+1));
        }

        System.out.println(maxWeight);

        br.close();
    }
}
