package src.Baekjoon.Bronze.Bronze1;

import java.util.Scanner;

public class Baekjoon_2775 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt(); // 테스트 케이스 수 입력

            for (int t = 0; t < T; t++) {
                int k = sc.nextInt(); // 층 수 입력
                int n = sc.nextInt(); // 호 수 입력

                int[][] apt = new int[k + 1][n + 1]; // 아파트 배열

                // 0층 초기화: 0층 i호에는 i명이 살고 있음
                for (int i = 1; i <= n; i++) {
                    apt[0][i] = i;
                }

                // 층별 거주자 수 계산
                for (int i = 1; i <= k; i++) {
                    for (int j = 1; j <= n; j++) {
                        // 현재 층 j호에는 (j-1)호 사람들의 수 + (i-1)층 j호 사람들의 수
                        apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
                    }
                }

                System.out.println(apt[k][n]); // 결과 출력
            }

            sc.close();
        }
    }

