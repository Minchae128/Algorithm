package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_2845 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] c = new int[5];
        int n = a * b;

        for (int i = 0; i < c.length; i++) {
            c[i] = in.nextInt();
            System.out.print(c[i] - n + " ");
        }
    }
}
