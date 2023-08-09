package src.Programmers.코딩기초트레이닝.Day3;
//두 수의 연산값 비교하기

import java.util.Scanner;

public class Day3_5 {
    public static int main(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer2 = 2 * a * b;
        if (answer >= answer2) {
            return answer;
        } else {
            return answer2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = main(a, b);
        System.out.println(result);
        sc.close();
    }
}
