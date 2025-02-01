package 백준.정렬;

import java.io.*;
import java.util.*;

public class 나이순_정렬 {

    static class Member {
        int age;
        String name;
        int index;

        public Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(age, name, i));
        }

        List<Member> memberArr = solution(members);

        for (Member m : memberArr) {
            System.out.println(m.age + " " + m.name);
        }
        br.close();
    }

    private static List<Member> solution(List<Member> members) {
        members.sort((o1, o2) -> {
            if (o1.age != o2.age) return Integer.compare(o1.age, o2.age);
            return Integer.compare(o1.index, o2.index);
        });
        return members;
    }
}
