package CodeUpBasic100;

import java.util.Random;
import java.util.Scanner;

public class code_1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = 24;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (min > a) {
                min = a;
            }
        }
        System.out.println(min);
    }
}