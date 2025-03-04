package 백준.DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 바이러스 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<n+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int node) {
        visited[node] = true;

        for(int nextNode : graph[node]) {
            if(!visited[nextNode]) {
                count++;
                dfs(nextNode);
            }
        }
    }
}
