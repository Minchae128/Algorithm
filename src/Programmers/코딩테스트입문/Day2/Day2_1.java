package src.Programmers.코딩테스트입문.Day2;
//두 수의 나눗셈

public class Day2_1 {
    public int solution(int num1, int num2) {
        double result = (double) num1 / num2 * 1000;

        return (int) result;
    }
}
