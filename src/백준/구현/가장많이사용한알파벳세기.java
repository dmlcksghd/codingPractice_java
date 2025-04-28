package 백준.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 가장많이사용한알파벳세기 {

    public static String countAlpabet(String alpabet) {
        Map<Character, Integer> map = new HashMap<>();
        char maxChar = ' ';
        int maxValue = Integer.MIN_VALUE;
        int maxCount = 0;

        // case1. 소문자로 변환
        alpabet = alpabet.toLowerCase();

        // case2. 알파벳 개수 세기
        for (char word : alpabet.toCharArray()) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // case3. 가장많이 나온 문자 찾기
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxChar = entry.getKey();
                maxCount = 1;
            } else if (entry.getValue() == maxValue) {
                maxCount++;
            }
        }

        if (maxCount > 1) {
            return "?";
        } else {
            return String.valueOf(Character.toUpperCase(maxChar));
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = br.readLine();

        System.out.println(countAlpabet(alphabet));
    }
}
