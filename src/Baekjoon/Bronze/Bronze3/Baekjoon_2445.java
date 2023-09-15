package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_2445 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N <= 0) {
            System.out.println("N은 양의 정수여야 합니다.");
            return; // 프로그램 종료
        }

        for (int i = 1; i <= N; i++) { // 1부터 N까지
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = N - 1; i >= 1; i--) { // N-1부터 1까지
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
