package src.Baekjoon.새싹.반복;

import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= a; i += 1) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            sum= b+c;
            System.out.println(sum);
        }

    }
}