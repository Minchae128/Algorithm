package src.Programmers.코딩기초트레이닝.Day5;
//등차수열 합계 계산
import java.util.Scanner;

public class Day5_2 {
    // 문제를 해결하는 메서드
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;      // 결과를 저장할 변수 초기화
        int term = a;        // 첫째항의 값을 저장하는 변수

        for (boolean isIncluded : included) {
            if (isIncluded) { // included가 true라면
                answer += term; // 결과에 현재 항의 값을 더해줍니다.
            }
            term += d;        // 다음 항의 값을 계산하기 위해 공차를 더해줍니다.
        }

        return answer;       // 결과 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 등차수열의 첫째항(a), 공차(d), 배열의 길이(n) 입력 받기
        System.out.print("첫째항(a)을 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("공차(d)를 입력하세요: ");
        int d = sc.nextInt();

        System.out.print("배열의 길이(n)를 입력하세요: ");
        int n = sc.nextInt();

        boolean[] included = new boolean[n];

        // 배열 included의 값 입력 받기
        System.out.println("배열 included의 값을 입력하세요:");
        for (int i = 0; i < n; i++) {
            included[i] = sc.nextBoolean();
        }

        // 문제를 해결하고 결과 출력
        int result = solution(a, d, included);
        System.out.println("결과: " + result);

        sc.close(); // Scanner 닫기
    }
}
