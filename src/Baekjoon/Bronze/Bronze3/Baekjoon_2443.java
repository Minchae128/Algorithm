package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 역삼각형 코드
        for (int i = 0; i < x; i++) {	// 1 ~ N

            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < (2 * x - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
