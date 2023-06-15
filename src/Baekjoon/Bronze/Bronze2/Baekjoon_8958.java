package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

//문자열 배열인 String 을 통해 각 줄의 OX 문자열을 각 배열에 저장한 뒤 이후 반복, 조건문을 통해 풀이

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0; //연속 횟수
            int sum = 0; //누적 합산

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                }else {
                    cnt =0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}

