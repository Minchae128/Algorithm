package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_5532 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int B = in.nextInt();
        int A = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int b = 0;
        int a = 0;

        if (B % C == 0) {
            b = B / C;
        } else {
            b = (B / C) + 1;
        }

        if (A % D == 0) {
            a = A / D;
        } else {
            a = (A / D) + 1;
        }

        if (a == b) {
            System.out.println(L - a);
        } else if (a < b) {
            System.out.println(L - b);
        } else {
            System.out.println(L - a);
        }
    }
}
