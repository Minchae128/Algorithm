package src.Baekjoon.silver.silver3;

import java.util.Scanner;

public class Baekjoon_1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();  // 입력값 중 작은 수
        int b = in.nextInt();  // 입력값 중 큰 수

        boolean[] isPrime = new boolean[b + 1];
        sieveOfEratosthenes(isPrime, b);

        // 주어진 범위 내의 소수 출력
        for (int i = a; i <= b; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    // 에라토스테네스의 체 알고리즘 구현
    private static void sieveOfEratosthenes(boolean[] isPrime, int n) {
        // 모든 수를 소수로 초기화
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 소수 판별
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
