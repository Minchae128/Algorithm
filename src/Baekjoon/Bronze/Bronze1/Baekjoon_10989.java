package src.Baekjoon.Bronze.Bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Baekjoon_10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}

/*
* 먼저 배열에 모든 원소를 입력받아 저장하고 Arrays 패키지에 있는 sort() 를 사용하여 정렬을 한다.
Arrays.sort() 의 경우 dual-pivot Quick sort 알고리즘을 사용한다.
* 평균 O(nlogn) 의 시간복잡도를 보이지만 최악의 경우 O(n2) 로 좋지 않는 성능이 될 수도 있음을 알아두어야 한다..*/