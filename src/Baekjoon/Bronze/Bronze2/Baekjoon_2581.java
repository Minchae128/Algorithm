package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;

        for (int i = M; i <= N; i++) {
            //소수인지 판별한 변수
            boolean check = true;
            //1이 올수 있지만 1은 소수가 아니기에 check에 false저장
            if (i == 1) check = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            //check가 true라면 실수이니 합하고, 최소값 저장
            if (check) {
                if (min > i) min = i;
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }

    }
}
