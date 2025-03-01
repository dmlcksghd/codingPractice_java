package 백준.큐;

import java.util.*;
import java.io.*;

public class 최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!minHeap.isEmpty()) {
                    sb.append(minHeap.poll()).append("\n");
                } else {
                    sb.append("0\n");
                }
            } else {
                minHeap.offer(num);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
