package src.Programmers.코딩테스트입문.Day4;

public class Day4_4 {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }

        answer = answer / numbers.length;

        return answer;
    }
}