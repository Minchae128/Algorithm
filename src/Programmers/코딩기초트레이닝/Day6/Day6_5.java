package src.Programmers.코딩기초트레이닝.Day6;
// 수열과 구간 쿼리2

import java.util.Scanner;

public class Day6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열의 크기 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 배열의 값들 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 쿼리 수 입력 받기
        int queryCount = sc.nextInt();
        int[][] queries = new int[queryCount][3];

        // 쿼리들 입력 받기
        for (int i = 0; i < queryCount; i++) {
            queries[i][0] = sc.nextInt(); // 시작 인덱스
            queries[i][1] = sc.nextInt(); // 끝 인덱스
            queries[i][2] = sc.nextInt(); // k 값
        }

        // 각각의 쿼리에 대해 최소값 찾아서 결과 배열에 저장
        int[] result = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            int s = queries[i][0]; // 시작 인덱스
            int e = queries[i][1]; // 끝 인덱스
            int k = queries[i][2]; // k 값

            int minVal = Integer.MAX_VALUE; // 현재 쿼리 범위에서의 최소값
            boolean found = false; // 조건을 만족하는 값이 있는지 여부

            // 쿼리 범위 내에서 조건을 만족하는 최소값 찾기
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    minVal = Math.min(minVal, arr[j]);
                    found = true;
                }
            }

            // 조건을 만족하는 값이 있으면 해당 값을 결과 배열에 저장, 아니면 -1 저장
            if (found) {
                result[i] = minVal;
            } else {
                result[i] = -1;
            }
        }

        // 처리된 결과 배열 출력
        for (int val : result) {
            System.out.println(val);
        }
    }
}