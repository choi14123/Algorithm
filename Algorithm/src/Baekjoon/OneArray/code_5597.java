package Baekjoon.OneArray;

import java.io.IOException;
import java.util.Scanner;

public class code_5597 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i = 0; i < 28; i++) {
          arr[sc.nextInt()] = true;
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != true)
                System.out.println(j);
        }
    }
}
