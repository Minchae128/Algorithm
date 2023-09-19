package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(f(n));
    }

    //피보나치 함수
    static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return f(n - 1) + f(n - 2);
    }
}
