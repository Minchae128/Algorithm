package src.Programmers.코딩기초트레이닝.Day4;
// flag에 따라 다른 값 반환하기

import java.util.Scanner;

public class Day4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();

        if (flag == true) {
            System.out.println(a + b);
        } else{
            System.out.println(a - b);
        }

    }
}
