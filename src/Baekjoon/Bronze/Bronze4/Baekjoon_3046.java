package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_3046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R1 = in.nextInt();
        int S = in.nextInt();

        int tal = S * 2;

        System.out.println(tal - R1);
    }
}
