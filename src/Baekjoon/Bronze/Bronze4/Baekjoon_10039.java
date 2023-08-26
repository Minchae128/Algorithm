package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_10039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();

            if (a[i] < 40) {  // 수정된 부분: 40 미만일 경우 40로 세팅
                sum += 40;
            } else {          // 수정된 부분: 40 이상일 경우 그대로 더함
                sum += a[i];
            }
        }
        System.out.println(sum / 5);
    }
}
