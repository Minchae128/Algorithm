package src.Programmers.코딩테스트입문.Day7;

public class Day7_3 {
    public int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + ((k - (n/10)) * 2000);

        return answer;
    }
}