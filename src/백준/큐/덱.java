package 백준.큐;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class 덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String str = br.readLine();

            if (str.startsWith("push_front")) {
                int x = Integer.parseInt(str.split(" ")[1]);
                deque.addFirst(x);
            } else if (str.startsWith("push_back")) {
                int x = Integer.parseInt(str.split(" ")[1]);
                deque.addLast(x);
            } else if (str.equals("pop_front")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
            } else if (str.equals("pop_back")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
            } else if (str.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (str.equals("empty")) {
                sb.append(deque.isEmpty() ? "1\n" : "0\n");
            } else if (str.equals("front")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
            } else if (str.equals("back")) {
                sb.append(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
            }
        }
        System.out.println(sb);
    }
}
