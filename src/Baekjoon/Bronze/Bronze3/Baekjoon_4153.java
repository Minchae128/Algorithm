package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break; // 0, 0, 0이 입력되면 반복문 종료
            }

            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                    Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                    Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
