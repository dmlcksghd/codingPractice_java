package codingtest.기업;

import java.util.*;

public class A_shin {

    public static int[] filterCalls(String[] approved, String[] spams, String[] calls, int k) {

        Set<String> approvedSet = new HashSet<>(Arrays.asList(approved));
        Set<String> spamSet = new HashSet<>(Arrays.asList(spams));
        Map<String, Integer> callCount = new HashMap<>();
        int[] answer = new int[calls.length];

        int len = calls.length;
        for(int i=0; i<len; i++) {
            String number = calls[i];
            if(approvedSet.contains(number)) answer[i] = 0;     //0은 안전 번호
            else if(spamSet.contains(number)) answer[i] = 1;    //1은 위험 번호
            else {
                callCount.put(number, callCount.getOrDefault(number, 0) + 1);
                answer[i] = callCount.get(number) > k ? 0 : 1;
            }
        }

        return answer;
    }

        // 테스트 코드
    public static void main(String[] args) {
        String[] approved = {"123", "456"};
        String[] spams = {"789"};
        String[] calls = {"111", "789", "123", "111", "111", "111", "111"};
        int k = 3;

        int[] result = filterCalls(approved, spams, calls, k);
        System.out.println(Arrays.toString(result)); // 예상 출력: [1, 1, 0, 1, 1, 0, 0]
    }

}
