package src.Baekjoon.새싹.반복;

import java.util.Scanner;

public class Baekjoon_2438 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}