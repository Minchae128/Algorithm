package src.Programmers.코딩테스트입문.Day10;

public class Day10_4 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length]; // 배열 크기를 초기화

        if (direction.equals("right")) { // 변수명 및 문자열 비교 수정
            for (int i = 0; i < numbers.length; i++) {
                answer[(i + 1) % numbers.length] = numbers[i]; // 배열을 오른쪽으로 회전
            }
        } else if (direction.equals("left")) { // 변수명 및 문자열 비교 수정
            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[(i + 1) % numbers.length]; // 배열을 왼쪽으로 회전
            }
        }

        return answer;
    }
}
