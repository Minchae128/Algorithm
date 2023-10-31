package src.Programmers.코딩테스트입문.Day11;

public class Day11_2 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (3 <= count) {
                answer++;
            }
        }

        return answer;
    }
}
/*
합성수??
-> 약수의 개수가 3개 이상인 수

이중 for문 사용하여 풀이
* i를 j로 나누었을 때 나머지가 0이 되는 수 마다 count를 1씩 증가
* i를 하나씩 돌때 마다 count를 새롭게 0으로 초기화
*
* 이렇게 해서 count가 3이상이 되었을때 answer을 1씩 증가시켜주면 된다.
*/