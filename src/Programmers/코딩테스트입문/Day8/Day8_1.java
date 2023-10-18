package src.Programmers.코딩테스트입문.Day8;

public class Day8_1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 1. 새로운 배열을 만들고, 크기를 설정합니다. 이 크기는 자를 범위의 길이와 같습니다.
        int[] answer = new int[num2 - num1 + 1];
        int k = 0; // 새로운 배열에 값을 넣을 위치를 나타내는 변수입니다.

        // 2. num1부터 num2까지의 범위를 순회합니다.
        for(int i = num1; i <= num2; i++){
            // 3. 현재 위치의 숫자를 새로운 배열에 복사하고, k를 증가시켜 다음 위치를 나타냅니다.
            answer[k++] = numbers[i];
        }
        // 4. 새로운 배열을 반환합니다.
        return answer;
    }
}


/*
* import java.util.Arrays; // 배열 복사를 위해 java.util 패키지의 Arrays 클래스를 임포트합니다.

public class Day8_1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 배열을 자를 범위를 포함하기 위해 num2에 1을 더합니다.
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer; // 잘라낸 결과를 반환합니다.
    }
}*/