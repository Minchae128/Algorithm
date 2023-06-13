package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        int max = arr[0];
        int count=0;

        for (int i = 0; i < 9; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count=i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
