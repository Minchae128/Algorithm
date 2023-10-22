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

/*두 숫자의 곱이 n인 자연수 순서쌍의 개수  =  m의 약수 개수
*
* 약수  =  어떤 수를 나누어 떨어지게 하는 수를 말한다.
* 즉, 입략값에 랜덤의 수를 나눌 떄 나머지가 0이 나오는 수가 입력값의 약수가 된다.*/