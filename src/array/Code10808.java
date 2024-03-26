package array;

import java.util.Scanner;

public class Code10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
            count[string.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
