package codingtest.스택과큐;

import java.util.*;

public class E_크레인인형뽑기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][]	board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, board, moves));
		
		sc.close();
	}

	private static int solution(int n, int m, int[][] board, int[] moves) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int tmp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.empty() && tmp==stack.peek()) {
						result+=2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		return result;
	}

}
