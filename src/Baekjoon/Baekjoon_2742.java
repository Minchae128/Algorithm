package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = n - i;

            System.out.println(sum);
        }
    }
}
