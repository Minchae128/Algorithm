package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000 - sc.nextInt();
        int tal = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        for (int coin : coins) {
            if (coin > a)
                continue;
            tal += a / coin;
            a %= coin;

        }
        System.out.println(tal);
    }
}

