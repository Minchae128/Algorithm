package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄짜리 별찍기를 하고 싶으세요? ");
        int n = sc.nextInt();

        // 피라미드 부분 출력
        for (int i = 1; i <= n; i++) { // i는 1부터 n까지 증가
            // 왼쪽에 공백 출력
            for (int j = 1; j <= n - i; j++) { // 별 출력 이전에 공백을 출력
                System.out.print(" ");
            }
            // 가운데 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) { // 별을 2*i-1번 출력
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println(); // 한 행이 끝나면 줄을 바꿔 다음 행으로 이동
        }

        // 역피라미드 부분 출력
        for (int i = n - 1; i >= 1; i--) { // i는 n-1부터 1까지 감소
            // 왼쪽에 공백 출력
            for (int j = 1; j <= n - i; j++) { // 별 출력 이전에 공백을 출력
                System.out.print(" ");
            }
            // 가운데 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) { // 별을 2*i-1번 출력
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println(); // 한 행이 끝나면 줄을 바꿔 다음 행으로 이동
        }
    }
}

