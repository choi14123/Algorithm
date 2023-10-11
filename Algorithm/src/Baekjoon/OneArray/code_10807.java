package Baekjoon.OneArray;

import java.io.*;
import java.util.StringTokenizer;

public class code_10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for (int j = 0; j < arr.length; j++) {
            if (b == arr[j]) {
                count++;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(count);
        System.out.printf(sb.toString());
    }
}