package src.Programmers.코딩테스트입문.Day8;

public class Day8_2 {
    public String solution(int age) {
        // 결과를 저장할 빈 문자열을 선언
        String answer = "";

        // 주어진 나이를 PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환
        while (age > 0) {
            // 나이의 가장 낮은 자릿수를 추출
            int digit = age % 10;

            // 숫자를 알파벳으로 변환
            char ch = (char) ('a' + digit);

            // 변환된 알파벳을 결과 문자열의 앞에 추가
            answer = ch + answer;

            // 다음 자릿수로 이동하기 위해 나이를 10으로 나눔
            age /= 10;
        }

        // PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환된 결과 반환
        return answer;
    }
}