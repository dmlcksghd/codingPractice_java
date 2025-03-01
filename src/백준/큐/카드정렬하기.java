package 백준.큐;

import java.io.*;
import java.util.*;

public class 카드정렬하기 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<n; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        int total = 0;
        while(queue.size() > 1) {
             int firstQueue = queue.poll();
             int secondQueue = queue.poll();
             int sum = firstQueue + secondQueue;
             total += sum;
             queue.offer(firstQueue + secondQueue);
        }
        bw.write(total + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
