package src.Programmers.코딩기초트레이닝.Day6;
// 수 조작하기 2

import java.util.Scanner;

public class Day6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 입력값으로 배열의 크기를 받음
        int[] numLog = new int[a];  // 입력값에 따라 배열 생성
        String n = "";  // 조작 문자열을 저장할 변수

        for (int i = 0; i < numLog.length; i++) {
            numLog[i] = sc.nextInt();  // 배열에 순차적으로 값을 입력 받음

            if (i > 0) {  // 배열의 첫 번째 원소는 이전 원소가 없으므로 비교하지 않음
                // 이전 원소와 현재 원소의 차이에 따라 조작 문자열을 생성
                if (numLog[i] - numLog[i - 1] == 1) {
                    n += "w";  // 1 차이면 "w" 추가
                } else if (numLog[i] - numLog[i - 1] == -1) {
                    n += "s";  // -1 차이면 "s" 추가
                } else if (numLog[i] - numLog[i - 1] == 10) {
                    n += "d";  // 10 차이면 "d" 추가
                } else if (numLog[i] - numLog[i - 1] == -10) {
                    n += "a";  // -10 차이면 "a" 추가
                }
            }
        }
        System.out.println(n);  // 생성된 조작 문자열 출력
    }
}

