package codingtest.재귀트리그래프;

public class G_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(Recursive(5));
	}

	private static int Recursive(int i) {
		if (i==1) return 1;
		else return i * Recursive(i-1);
	}
}
