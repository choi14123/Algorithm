import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int div = num / 4;
        for (int i = 0; i < div; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}