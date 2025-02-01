package 백준.정렬;

import java.io.*;
import java.util.*;

public class 일곱_난쟁이 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        int sum = 0;
        for (int i=0; i<9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        int fake1 = -1, fake2 = -1;
        for (int i=0; i<9; i++) {
            for (int j=i+1; j<9; j++) {
                if (sum - dwarfs[i] - dwarfs[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if (fake1 != -1) break;
        }

        List<Integer> realDwarfs = new ArrayList<>();
        for (int i=0; i<9; i++) {
            if (i != fake1 && i != fake2) {
                realDwarfs.add(dwarfs[i]);
            }
        }

        Collections.sort(realDwarfs);

        for (int dwarf : realDwarfs) {
            System.out.println(dwarf);
        }
    }
}
