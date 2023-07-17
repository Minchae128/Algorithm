package src.Baekjoon.새싹.함수;

import java.util.Scanner;

public class Baekjoon_15964 {
    public static void main(String[] args) throws Exception {
        //input
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = (a + b) * (a - b);

        System.out.println(c);

    }
}
