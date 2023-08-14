package src.Programmers.코딩기초트레이닝.Day5;
// 코드처리하기
import java.util.Scanner;

public class Day5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 입력 받음
        System.out.print("문자열 code를 입력하세요: ");
        String code = sc.nextLine();

        // solution 함수 호출하여 결과 얻기
        String result = solution(code);

        // 결과 출력
        System.out.println("결과: " + result);

        // Scanner 닫기
        sc.close();
    }

    // 주어진 code 문자열을 처리하여 결과 문자열을 반환하는 함수
    public static String solution(String code) {
        // mode 변수 초기화 (0: mode 0, 1: mode 1)
        int mode = 0;
        // 결과 문자열 ret 초기화
        String ret = "";

        // 주어진 문자열 code를 순회하면서 처리
        for (int idx = 0; idx < code.length(); idx++) {
            // 현재 위치의 문자 가져오기
            char currentChar = code.charAt(idx);

            // mode에 따라 다른 처리 수행
            if (mode == 0) {
                // 현재 문자가 "1"이 아니고, 현재 위치가 짝수라면
                if (currentChar != '1' && idx % 2 == 0) {
                    // ret에 현재 문자 추가
                    ret += currentChar;
                } else if (currentChar == '1') {
                    // 현재 문자가 "1"이면 mode를 0에서 1로 변경
                    mode = 1;
                }
            } else {
                // 현재 문자가 "1"이 아니고, 현재 위치가 홀수라면
                if (currentChar != '1' && idx % 2 == 1) {
                    // ret에 현재 문자 추가
                    ret += currentChar;
                } else if (currentChar == '1') {
                    // 현재 문자가 "1"이면 mode를 1에서 0으로 변경
                    mode = 0;
                }
            }
        }

        // 만약 결과 문자열 ret이 비어있다면 "EMPTY" 반환, 아니면 ret 반환
        if (ret.isEmpty()) {
            return "EMPTY";
        } else {
            return ret;
        }
    }
}

