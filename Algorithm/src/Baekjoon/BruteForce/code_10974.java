package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class code_10974 {
    private static int n;
    private static int[] arr;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        boolean[] visit = new boolean[n];

        dfs(0);
    }
    private static void dfs(int cnt) {
        if (cnt == n) {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                arr[cnt] = i + 1;
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
}