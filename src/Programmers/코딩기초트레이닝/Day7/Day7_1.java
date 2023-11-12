package src.Programmers.코딩기초트레이닝.Day7;
// 마지막 두 원소

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day7_1 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++)
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0)
                    arr[j]++;
            }
        return arr;
    }
}