package 백준.정렬;

import java.io.*;
import java.util.*;

public class 소트인사이드 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine().trim();

        System.out.println(solution(n));
    }

    private static int solution(String n) {
        char[] digits = n.toCharArray();

        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));

        sb.reverse();

        return Integer.parseInt(sb.toString());
    }
}
