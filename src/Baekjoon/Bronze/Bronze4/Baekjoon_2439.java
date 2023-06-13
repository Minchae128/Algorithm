package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 1; i <=a; i++) {
            for (int j=a; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
