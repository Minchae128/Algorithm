package src.Programmers.코딩기초트레이닝.Day3;
//문자 리스트를 문자열로 변환하기

import java.util.Scanner;

public class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
            answer += arr[i];
        }

        System.out.print(answer);
    }
}