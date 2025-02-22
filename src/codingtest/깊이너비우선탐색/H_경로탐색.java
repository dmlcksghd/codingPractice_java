package codingtest.깊이너비우선탐색;

import java.util.Scanner;
/*노드에서 노드로 가는 가지 수*/
public class H_경로탐색 {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //노드
        m = sc.nextInt();   //간선
        graph = new int[n+1][n+1];  //1부터n까지
        check = new int[n+1];       //방문여부 체크
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;        //a노드에서 b노드로 가는 간선이 있음
        }
        check[1] = 1;
        dfs(1);
        System.out.println(answer);
    }

    private static void dfs(int v) {
        if(v==n) answer++;
        else {
            for(int i=1; i<=n; i++) {
                if(graph[v][i]==1 && check[i]==0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }
}
