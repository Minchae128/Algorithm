package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_2675 {
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

/*
* 조금만 더 생각하면 쉽게 풀 수 있는데
*지금 당장 자바 기초가 부족하니 풀이 시간이 오래 걸린다.
* 기초 복습 하고 오답 노트 작성해보자!!*/