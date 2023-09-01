package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_10797 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[5];
        int cont = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (n == arr[i]) {
                cont += 1;
            }
        }
        System.out.println(cont);

    }
}
