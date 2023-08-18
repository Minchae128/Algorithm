package src.Programmers.코딩기초트레이닝.Day5;
// 이어 붙인 수

import java.util.Scanner;

public class Day5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받을 정수 리스트의 길이를 저장합니다.
        int[] num_list = new int[n]; // 입력받을 정수 리스트를 선언합니다.
        String a = "";
        String b = "";

        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = sc.nextInt();
            if (num_list[i] % 2 == 0) {
                a = a + Integer.toString(num_list[i]);
            } else {
                b = b + Integer.toString(num_list[i]);
            }
        }
        int tal = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(tal);
    }
}
