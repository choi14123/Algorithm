package Baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[1];
        arr[0] = br.readLine();
        int num = Integer.parseInt(br.readLine());

        System.out.print(arr[0].substring(num-1, num));
    }
}