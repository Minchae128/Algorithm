package src.Baekjoon.새싹.입력과계산;

import java.util.Scanner;

public class Baekjoon_10998 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(0 < A && B < 10){
            System.out.println(A*B);
        }
        sc.close();
    }
}
