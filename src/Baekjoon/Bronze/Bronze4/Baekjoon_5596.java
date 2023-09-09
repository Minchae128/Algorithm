package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_5596 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];
        int S = 0;
        int T = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            S += a[i];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
            T += b[i];
        }

        if (S < T) {
            System.out.println(T);
        } else if (S == T) {
            System.out.println(S);
        } else {
            System.out.println(S);
        }
    }
}
