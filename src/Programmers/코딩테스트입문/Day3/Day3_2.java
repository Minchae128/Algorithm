package src.Programmers.코딩테스트입문.Day3;
//중앙값 구하기

import java.util.Arrays;

public class Day3_2 {
    public int solution(int[] array) {
        Arrays.sort(array);

        return array[array.length/2];

    }
}
