package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_10101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int sum = a + b + c;

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180 && (a == b || a == c || b == c)) {
            System.out.println("Isosceles");
        } else if (sum == 180 && (a != b || a != c || b != c)) {
            System.out.println("Scalene");
        } else if (sum != 180) {
            System.out.println("Error");
        }
    }
}
