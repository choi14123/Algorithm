package array;


import java.util.Scanner;

public class Code10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int arr[] = new int[number];
        int count = 0;

        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        int find = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}