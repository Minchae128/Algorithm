package src.Programmers.코딩테스트입문.Day4;

public class Day4_1 {
    public int solution(int n) {
        int answer = 0;

        if (7 < n) {
            if (n % 7 != 0) {
                answer = (n / 7) + 1;
            } else {
                answer = (n / 7);
            }
        } else {
            answer = 1;
        }
        return answer;
    }
}
