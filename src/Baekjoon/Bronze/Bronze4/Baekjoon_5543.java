package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_5543 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int b = 0;
        int d = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
            b = arr[0];
            for (int j = 0; j < 3; j++) {
                if (b > arr[j]) {
                    b = arr[j];
                }
            }
        }

        if (arr[3] < arr[4]) {
            d = arr[3];
        } else {
            d = arr[4];
        }

        System.out.println((b + d) - 50);
    }
}
