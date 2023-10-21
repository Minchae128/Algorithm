package src.Programmers.코딩테스트입문.Day8;

public class Day8_4 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0) answer++;
        }
        return answer;
    }
}