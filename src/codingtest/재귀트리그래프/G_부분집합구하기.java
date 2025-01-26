package codingtest.재귀트리그래프;

public class G_부분집합구하기 {

	static int n;
	static int[] ch;
	
	public static void DFS(int L) {
		if (L==n+1) {
			String tmp = "";
			for (int i=1; i<=n; i++) {
				if (ch[i] == 1) tmp += (i + " ");
			}
			if (tmp.length() > 0) System.out.println(tmp);
			
		} else {
			ch[L] = 1;	// 사용o
			DFS(L+1);
			ch[L] = 0;	// 사용x
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		n = 3;
		ch = new int[n+1];
		DFS(1);

	}

}
