package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_2440 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
