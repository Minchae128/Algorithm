package src.Baekjoon.새싹.조건;

import java.util.Scanner;

public class Baekjoon_2420 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a-b <0) {
            System.out.println(-(a-b));
        } else if (a-b >= 0) {
            System.out.println(a-b);
        }
    }
}
