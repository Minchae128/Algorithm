package src.Programmers.코딩기초트레이닝.Day5;
//주사위 게임2

import java.util.Scanner;

public class Day5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 첫 번째 주사위 눈의 값 입력
        int b = sc.nextInt(); // 두 번째 주사위 눈의 값 입력
        int c = sc.nextInt(); // 세 번째 주사위 눈의 값 입력

        int score = 0; // 얻는 점수를 저장할 변수 초기화

        if (a != b && b != c && c != a) { // 세 숫자가 모두 다른 경우
            score = a + b + c; // 세 숫자의 합을 점수로 저장
        } else if (a == b && b == c) { // 세 숫자가 모두 같은 경우
            score = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
            // 세 숫자의 합을 제곱과 세제곱을 곱한 값으로 점수를 저장
        } else { // 두 숫자가 같은 경우
            int[] freq = new int[7]; // 각 주사위 눈의 빈도를 저장하는 배열 (인덱스 1부터 6까지 사용)
            freq[a]++; // 첫 번째 숫자의 빈도 증가
            freq[b]++; // 두 번째 숫자의 빈도 증가
            freq[c]++; // 세 번째 숫자의 빈도 증가

            for (int i = 1; i <= 6; i++) {
                if (freq[i] == 2) { // 같은 숫자가 두 개 있는 경우
                    score = (a + b + c) * (a * a + b * b + c * c);
                    // 세 숫자의 합을 제곱을 곱한 값으로 점수를 저장
                    break; // 빈도를 체크할 필요가 없으므로 반복문 종료
                }
            }
        }

        System.out.println(score); // 계산된 점수 출력
    }
}

