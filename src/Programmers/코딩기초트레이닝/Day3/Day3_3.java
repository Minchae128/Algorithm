package src.Programmers.코딩기초트레이닝.Day3;
//문자열 곱하기

import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            System.out.print(my_string);
        }


    }
}