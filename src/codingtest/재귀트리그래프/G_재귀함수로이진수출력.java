package codingtest.재귀트리그래프;

public class G_재귀함수로이진수출력 {

	public static void main(String[] args) {
		Recursive(11);
	}

	private static void Recursive(int i) {
		if (i==0) return;
		else {
			System.out.println(i%2 + " ");
			Recursive(i/2);
		}
	}

}
