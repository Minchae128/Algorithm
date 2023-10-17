package src.Programmers.코딩테스트입문.Day7;

public class Day7_4 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i<=n; i++){

            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}