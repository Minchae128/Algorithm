package src.Programmers.코딩기초트레이닝.Day2;

import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else if (n % 2 != 0) {
            System.out.println(n + " is odd");
        }
    }
}
