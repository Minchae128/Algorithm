package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();

            for (int j = 0; j < b.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(b.charAt(j));
                }
            }
            System.out.println(); // 각 테스트 케이스의 출력 끝에 줄바꿈을 추가
        }
    }
}
