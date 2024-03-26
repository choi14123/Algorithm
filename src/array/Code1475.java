package array;

import java.util.Arrays;
import java.util.Scanner;

public class Code1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String[] str = N.split("");

        int[] arr = new int[10];
        int check = 0;

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < 10; j++) {
                if (Integer.parseInt(str[i]) == j) {
                    if (j == 6) {
                        j = 9;
                    }
                    arr[j]++;
                }
            }
        }
        arr[9] = arr[9] / 2 + arr[9] % 2;

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}