package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == a) {
                count++;
            }
        }
        System.out.print(count);
    }
}