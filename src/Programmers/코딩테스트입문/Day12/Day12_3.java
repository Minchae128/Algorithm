package src.Programmers.코딩테스트입문.Day12;

import java.util.Arrays;

public class Day12_3 {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
}