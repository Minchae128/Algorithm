package src.Baekjoon.Bronze.Bronze1;

import java.util.Scanner;

public class Baekjoon_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int C = in.nextInt(); // 테스트 케이스의 수를 입력받습니다.

        for (int i = 0; i < C; i++) { // 각 테스트 케이스에 대한 반복문 시작
            int n = in.nextInt(); // 학생의 수를 입력받습니다.
            int[] arr = new int[n]; // 학생들의 점수를 저장할 배열을 생성합니다.
            int num = 0; // 학생들의 점수 합계를 저장할 변수를 초기화합니다.

            for (int k = 0; k < n; k++) { // 학생들의 점수를 입력받고 합계를 계산합니다.
                arr[k] = in.nextInt();
                num += arr[k];
            }

            // 평균을 계산합니다. 소수 부분을 계산하기 위해 형변환을 해야 합니다.
            float average = (float) num / n;

            int aboveAverageCount = 0; // 평균 이상인 학생 수를 저장할 변수를 초기화합니다.

            for (int k = 0; k < n; k++) { // 평균 이상인 학생 수를 계산합니다.
                if (arr[k] > average) {
                    aboveAverageCount++;
                }
            }

            // 평균 이상인 학생 비율을 계산하고 출력합니다. 소수점 아래 두 자리까지 출력합니다.
            float percentage = (float) aboveAverageCount / n * 100;
            System.out.printf("%.3f%%%n", percentage);
        }
    }
}
