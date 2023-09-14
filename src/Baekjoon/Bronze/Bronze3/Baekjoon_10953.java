package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        int[] result = new int[x];

        for (int i = 0; i < x; i++) {
            String input = sc.nextLine();
            String[] num = input.split(",");

            if (num.length == 2) {
                int a = Integer.parseInt(num[0]);
                int b = Integer.parseInt(num[1]);
                result[i] = a + b;
            }
        }

        // 결과 배열을 출력
        for (int i = 0; i < x; i++) {
            System.out.println(result[i]);
        }
    }
}

