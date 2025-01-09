package codingtest.재귀트리그래프;

public class 재귀함수_스택프레임 {

	public static void main(String[] args) {
		Recursive(3);
	}

	private static void Recursive(int i) {
		if (i==0) return;
		else {
			Recursive(i-1);
			System.out.print(i + " ");
		}
	}

}
