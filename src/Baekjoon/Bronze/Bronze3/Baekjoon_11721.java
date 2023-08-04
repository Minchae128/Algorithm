package src.Baekjoon.Bronze.Bronze3;

import java.util.Scanner;

public class Baekjoon_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.print(n.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }

    }
}
