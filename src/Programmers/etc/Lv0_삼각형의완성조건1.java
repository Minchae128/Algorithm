package src.Programmers.etc;

import java.util.Arrays;
// 간결한 코드
//오름차순으로 정리하고 if-else 문 하나만 사용하면 더 효율적인 코드가 된다.
public class Lv0_삼각형의완성조건1 {
    public int solution(int[] sides) {
        // 배열을 정렬하여 가장 큰 변이 항상 마지막에 위치하도록 합니다.
        Arrays.sort(sides);

        // 가장 큰 변의 길이가 나머지 두 변의 길이의 합보다 크면 삼각형이 만들어질 수 없습니다.
        if (sides[0] + sides[1] > sides[2]) {
            // 삼각형이 가능한 경우
            return 1;
        } else {
            // 삼각형이 불가능한 경우
            return 2;
        }
    }
}

/*내가 푼 풀이
*
* class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        // 가장 긴 변을 찾기 위해 조건문 사용
        if (sides[1] < sides[0]) {
            if (sides[2] < sides[0]) {
                // sides[0]이 가장 긴 변일 때
                if (sides[0] < (sides[1] + sides[2])) {
                    answer = 1;  // 삼각형이 가능한 경우
                } else {
                    answer = 2;  // 삼각형이 불가능한 경우
                }
            } else if (sides[0] < sides[2]) {
                // sides[2]가 가장 긴 변일 때
                if (sides[1] < sides[2]) {
                    if (sides[2] < (sides[0] + sides[1])) {
                        answer = 1;  // 삼각형이 가능한 경우
                    } else {
                        answer = 2;  // 삼각형이 불가능한 경우
                    }
                }
            }
        } else if (sides[0] < sides[1]) {
            // sides[1]이 가장 긴 변일 때
            if (sides[2] < sides[1]) {
                if (sides[1] < (sides[0] + sides[2])) {
                    answer = 1;  // 삼각형이 가능한 경우
                } else {
                    answer = 2;  // 삼각형이 불가능한 경우
                }
            }
        }

        return answer;
    }
}
*
* 피드백
*
원래 코드에서 가장 큰 문제는, 복잡한 중첩된 조건문으로 인해 코드가 어려워졌고, 그 결과 실수할 가능성이 큽니다.
* 특히 조건이 여러 개 중첩되면서 코드가 복잡해지면 코드를 이해하고 디버깅하기가 어려워집니다.
* */