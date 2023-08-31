package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_2530 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        int S = in.nextInt();
        int A = in.nextInt();

        S += A;

        if (S >= 60) {
            M += S / 60;
            S %= 60;
            if (M >= 60) {
                H += M / 60;
                M %= 60;
                if (H >= 24) {
                    H %= 24;
                }
            }
        }
        System.out.println(H + " " + M + " " + S);
    }
}
