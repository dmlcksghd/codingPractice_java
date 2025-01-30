package codingtest.재귀트리그래프;

import java.util.*;

public class G_이진트리레벨탐색_BFS {
    Node root;

    public static void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(l + " Level : ");

            for (int i = 0; i < len; i++) {
                Node current = q.poll();
                System.out.print(current.data + " ");
                if (current.lt != null) q.offer(current.lt);
                if (current.rt != null) q.offer(current.rt);
            }
            l++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // tree 객체 선언 및 초기화
        G_이진트리레벨탐색_BFS tree = new G_이진트리레벨탐색_BFS();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        // BFS 호출
        BFS(tree.root);
    }
}

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}