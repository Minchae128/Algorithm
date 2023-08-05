package src.Programmers.코딩기초트레이닝.Day3;
//문자열 섞기

import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.substring(i, i + 1);
            answer += str2.substring(i, i + 1);
        }
        System.out.println(answer);
    }
}