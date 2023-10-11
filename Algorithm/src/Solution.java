import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        int num = number.length();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(number.substring(i, i + 1)));
        }

        Collections.sort(arr, Comparator.reverseOrder());

        for (int i = 0; i < num; i++) {
            System.out.print(arr.get(i));
        }
    }
}