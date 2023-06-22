package src.Baekjoon.Bronze.Bronze5;

import java.util.Scanner;

public class Baekjoon_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 1;
        int q = 1;
        int r = 2;
        int b = 2;
        int kn = 2;
        int p = 8;

        k = k-sc.nextInt();
        q = q-sc.nextInt();
        r = r-sc.nextInt();
        b = b-sc.nextInt();
        kn = kn-sc.nextInt();
        p = p-sc.nextInt();

        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(r + " ");
        System.out.print(b + " ");
        System.out.print(kn + " ");
        System.out.print(p);
    }
}
