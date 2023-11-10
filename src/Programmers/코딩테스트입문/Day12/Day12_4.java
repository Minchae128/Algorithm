package src.Programmers.코딩테스트입문.Day12;

import java.util.ArrayList;
import java.util.List;

public class Day12_4 {
    public int[] solution(int n) {
        // 약수를 저장할 리스트
        List<Integer> list = new ArrayList<>();
        // 소수를 저장할 리스트
        List<Integer> prime = new ArrayList<>();
        // 소수를 세기 위한 카운트 변수
        int count = 0;

        // n의 약수 찾기
        for (int i = 2; i <= n; i++) {
            // n을 i로 나누어 떨어지면 i는 n의 약수
            if (n % i == 0) {
                list.add(i);
            }
        }

        // n의 약수 중에서 소수 찾기
        for (int i = 0; i < list.size(); i++) {
            for (int j = 2; j <= n; j++) {
                // 현재 약수가 다른 숫자로 나누어지면 count 증가
                if (list.get(i) % j == 0) {
                    count += 1;
                }
            }
            // 약수가 자신 하나라면 소수이므로 prime 리스트에 추가
            if (count == 1) {
                prime.add(list.get(i));
            }
            // count 초기화
            count = 0;
        }

        // 소수를 담은 리스트를 배열로 변환
        int[] answer = new int[prime.size()];
        // prime 리스트의 값들을 answer 배열에 복사
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prime.get(i);
        }
        // 소수 배열 반환
        return answer;
    }
}
