 package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code_2309 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int n1 = 0, n2 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        sum = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    n1 = arr[i];
                    n2 = arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (n1 == arr[i] || n2 == arr[i]) continue;
            System.out.println(arr[i]);
        }
    }
}