package src.Programmers.코딩테스트입문.Day11;

public class Day11_1 {
    public int solution(int[] box, int n) {
        int answer = 0;

        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);


        return answer;
    }
}

// 수학적인 문제
// 주사위 수를 구하기 위해서는
// 주어지는 각각의 가로 세로 높이는 주사위 길이만큼 각각 나눈 후 결과 값들을 곱해주면 되는 문제