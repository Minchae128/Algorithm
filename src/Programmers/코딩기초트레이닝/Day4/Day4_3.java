package src.Programmers.코딩기초트레이닝.Day4;
// 홀짝에 따라 다른 값 반환하기

import java.util.Scanner;

public class Day4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {

            if (n % 2 == 1 && i % 2 == 1) {
                result += i;
            } else if (n % 2 == 0 && i % 2 == 0) {
                result += i * i;
            }
        }
        System.out.println(result);
    }
}
