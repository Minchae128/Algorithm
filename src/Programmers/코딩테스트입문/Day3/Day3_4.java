package src.Programmers.코딩테스트입문.Day3;
//짝수는 싫어요


public class Day3_4 {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[i / 2] = i;

            }
        }

        return answer;

    }
}
