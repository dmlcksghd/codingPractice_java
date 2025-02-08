package 백준.정렬;

import java.io.*;
import java.util.Arrays;

public class 대표값2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int mean = 0;
        int[] n = new int[5];
        for (int i=0; i<5; i++) {
            n[i] = Integer.parseInt(br.readLine());
            mean += n[i];
        }

        Arrays.sort(n);
        System.out.print(mean/5 + "\n" + n[2]);

        br.close();
        bw.close();
    }
}
