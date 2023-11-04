package src.Programmers.코딩테스트입문.Day11;

public class Day11_3 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;

        return answer;
    }
}