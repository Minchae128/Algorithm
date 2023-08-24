package src.Programmers.코딩기초트레이닝.Day6;
// 수열과 구간 쿼리3

import java.util.Scanner;

public class Day6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열의 크기 입력 받기
        int a = sc.nextInt();
        int[] arr = new int[a];

        // 배열의 값들 입력 받기
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // 쿼리 수 입력 받기
        int queryCount = sc.nextInt();
        int[][] queries = new int[queryCount][2];

        // 쿼리들 입력 받기
        for (int i = 0; i < queryCount; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        // 각각의 쿼리 처리하여 배열 arr 변경
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            // arr[i]와 arr[j]의 값을 서로 바꿈
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 처리된 배열 출력
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
