package Baekjoon.InputOutput;

import java.util.Scanner;

public class code_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; ++i) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println("Case #" + i + ": " + A + " + " + B + " =" + " " + (A + B));
        }
    }
}