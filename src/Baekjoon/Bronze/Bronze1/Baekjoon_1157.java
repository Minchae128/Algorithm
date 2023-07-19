package src.Baekjoon.Bronze.Bronze1;

import java.util.Scanner;

public class Baekjoon_1157 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[26]; //영문자의 개수는 26개
        String a = in.next(); // 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.(nextLine는 문자 또는 엔터를 치기 전짜지의 문장 전체)

        for (int i = 0; i < a.length(); i++) { //문자 검사하기 위한 반복문

            if (65 <= a.charAt(i) && a.charAt(i) <= 90) { // 대문자 범위
                arr[a.charAt(i) - 65]++; //헤딩 인덱스의 값 1증가
            } else {//소문자 범위
                arr[a.charAt(i) - 97]++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
