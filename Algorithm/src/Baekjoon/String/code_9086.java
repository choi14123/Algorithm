package Baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 1) {
                System.out.println(arr[i] + "" + arr[i]);
            } else {
                System.out.print(arr[i].substring(0, 1));
                System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));
            }
        }
    }
}