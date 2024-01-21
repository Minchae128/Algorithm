package src.Programmers.etc;

public class Lv0_숨어있는숫자의덧셈 {
    public int solution(String my_string) {
        // 최종 결과를 저장할 변수 선언
        int answer = 0;

        // 문자열에서 숫자 이외의 모든 문자를 제거
        my_string = my_string.replaceAll("[^0-9]", "");

        // 문자열을 char 배열로 변환
        char[] charArray = my_string.toCharArray();

        // char 배열의 각 문자에 대해 덧셈 수행
        for (char c : charArray) {
            // char를 숫자로 변환하여 덧셈 수행 후 결과를 answer에 누적
            answer += Character.getNumericValue(c);
        }

        // 최종 결과 반환
        return answer;
    }
}