package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class code_11651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] xy = new int[num][2];
        for (int i = 0; i < num; i++) {
            xy[i][1] = scanner.nextInt();
            xy[i][0] = scanner.nextInt();
        }
        Arrays.sort(xy, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });
        for (int i = 0; i < num; i++) {
            System.out.println(xy[i][1] + " " + xy[i][0]);
        }
    }
}
