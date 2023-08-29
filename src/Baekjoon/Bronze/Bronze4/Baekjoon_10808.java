package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_10808 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[26];  // 알파벳 개수를 저장하는 배열

        String S = in.nextLine();  // 문자열 입력 받기

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);  // 문자열의 i번째 문자 가져오기

            // 소문자 알파벳인 경우
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;  // 알파벳을 배열 인덱스로 변환하여 개수 증가
            }
            // 대문자 알파벳인 경우
            else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;  // 알파벳을 배열 인덱스로 변환하여 개수 증가
            }
            // 알파벳이 아닌 경우 (공백 등)
            // 이 부분은 문제에 따라 처리 방식이 다를 수 있음
        }

        // 알파벳 개수 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");  // 개행 없이 개수 출력
        }
    }
}
