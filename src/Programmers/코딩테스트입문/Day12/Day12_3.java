package src.Programmers.코딩테스트입문.Day12;

import java.util.Arrays;

public class Day12_3 {
    public int solution(String my_string) {
        // 영문 알파벳을 모두 제거
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        // 각 숫자를 문자열 배열로 분리
        String[] arr = my_string.split("");

        // 합을 저장할 변수 초기화
        int answer = 0;

        // 배열의 각 요소를 정수로 변환하여 합 계산
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }

        // 최종 합 반환
        return answer;
    }
}