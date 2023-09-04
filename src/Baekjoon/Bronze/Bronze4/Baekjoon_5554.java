package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_5554 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[4];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
            sum += A[i];
        }

        int a = sum / 60;
        int b = sum % 60;

        if (60 <= b) {
            System.out.println(a);
            System.out.println("0");
        } else {
            System.out.println(a);
            System.out.println(b);
        }

    }
}
