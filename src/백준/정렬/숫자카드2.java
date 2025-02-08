package 백준.정렬;

import java.io.*;
import java.util.*;

public class 숫자카드2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cardMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            bw.write(cardMap.getOrDefault(target, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
