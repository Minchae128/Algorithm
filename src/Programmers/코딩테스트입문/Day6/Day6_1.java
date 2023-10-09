package src.Programmers.코딩테스트입문.Day6;

public class Day6_1 {
    public String solution(String my_string) {
        // 문자열을 뒤집기 위한 StringBuilder를 생성합니다.
        StringBuilder answer = new StringBuilder(my_string);

        // StringBuilder를 뒤집습니다.
        answer.reverse();

        // StringBuilder를 문자열로 변환하여 반환합니다.
        return answer.toString();
    }
}