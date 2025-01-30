package codingtest.재귀트리그래프;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class G_송아지찾기1 {
    int result = 0;
    int[] dis = {1, -1, 5};
    int[] check;
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        q.offer(s);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i=0; i<len; i++) {
                int x = q.poll();
                for (int j=0; j<3; j++) {
                    int nx = x + dis[j];
                    if (x == e) return l;
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            l++;
        }
        return l;
    }

    public static void main(String[] args) throws IOException {
        G_송아지찾기1 tree = new G_송아지찾기1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(tree.BFS(s, e));
    }
}
