package Baekjoon.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class code_2075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < num; i++) {
            System.out.println(numbers[i]);
        }
    }
}