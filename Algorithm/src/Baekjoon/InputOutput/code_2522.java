package Baekjoon.InputOutput;

import java.util.Scanner;

public class code_2522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(" ".repeat(num - i));
            System.out.print("*".repeat(i));
            System.out.println();
        }
        for (int i = 1; i <= num - 1; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat(num - i));
            System.out.println();
        }
    }
}