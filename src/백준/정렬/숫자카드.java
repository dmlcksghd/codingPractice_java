package 백준.정렬;

import java.util.*;
import java.io.*;

public class 숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> cardSet = new HashSet<>();
        String[] input = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            cardSet.add(Integer.parseInt(input[i]));
        }

        int m = Integer.parseInt(br.readLine());
        input = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            int target = Integer.parseInt(input[i]);
            sb.append(cardSet.contains(target) ? "1" : "0").append(" ");
        }
        System.out.println(sb.toString().trim());
        }
}
