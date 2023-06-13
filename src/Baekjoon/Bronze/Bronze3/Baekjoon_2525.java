package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();

        int min = a *60 +b; // min = 60 * 시 + 분  시 -> 분으로 변환
        min = min +c; //총 걸린 시간

        int h = (min / 60) % 24; // 24시 이상이 도리 경우 0부터 다시 시작하도록 한다.
        int m = min % 60; // 분

        System.out.println(h + " " + m);
    }
}
