package src.Programmers.코딩테스트입문.Day5;
//아이스아메리카노

public class Day5_2 {
    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}