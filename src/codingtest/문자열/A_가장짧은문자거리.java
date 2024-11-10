package codingtest.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class A_가장짧은문자거리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		for(int i : solution(input)) {
			System.out.print(i + " ");
		}

		sc.close();
	}

	// teachermode e
	private static ArrayList<Integer> solution(String str) {
		String[] s = new String[2];
		s = str.split(" ");
		String words = s[0];
		char target = s[1].charAt(0);
		
		int len = words.length();
		ArrayList<Integer> distances = new ArrayList<>();
		
		int cnt = len;
		for(int i=0; i<len; i++) {
			if(words.charAt(i) == target) {
				cnt = 0;
			} else {
				cnt++;
			}
			distances.add(cnt);
		}
		
		cnt = len;
		for(int i=len-1; i>=0; i--) {
			if(words.charAt(i) == target) {
				cnt = 0;
			} else {
				cnt++;
			}
			distances.set(i, Math.min(distances.get(i), cnt));
		}
		return distances;
	}
}
