package src.Baekjoon.Bronze.Bronze2;


import java.util.Scanner;

// 숫자를 뒤집으로면 숫자를 10으로 나눈 나머지를 계속 더해줘야 함
// 더하기를 할 때, 기존 숫자에 곱하기 10을 해주어야 자릿수를 하나씩 넘길 수 있다.

public class Baekjoon_2908 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1 = 0;
        int num2 = 0;

        while (a != 0) {
            num1 = num1 * 10 + a % 10;

            a = a / 10;
        }

        while (b != 0) {
            num2 = num2 * 10 + b % 10;

            b = b / 10;
        }

        if (num2 < num1) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        }
    }
}