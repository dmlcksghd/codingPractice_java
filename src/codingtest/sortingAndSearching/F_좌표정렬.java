package codingtest.sortingAndSearching;

import java.util.*;
import java.io.*;

public class F_좌표정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Point[]	points = new Point[n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			points[i] = new Point(x, y);
		}
		Arrays.sort(points);
		
		for(Point o : points) sb.append(o.x).append(" ").append(o.y).append("\n");
		
		System.out.println(sb);
	}

}

class Point implements Comparable<Point> {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x; 
	}
}

