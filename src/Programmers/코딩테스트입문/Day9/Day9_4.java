package src.Programmers.코딩테스트입문.Day9;
//combination 조합 = n개의 숫자 중에서 r개의 수를 순서 없이 뽑는 경우

public class Day9_4 {
        // 구슬을 나누는 함수
        public int solution(int balls, int share) {
            return combination(balls, share); // combination 함수를 호출하여 결과 반환
        }

        // 구슬을 나누는 경우의 수를 계산하는 재귀 함수
        public static int combination(int balls, int share) {
            // Base case: 구슬 수가 나누어줄 구슬 수와 같거나 나누어줄 구슬이 없는 경우
            if (balls == share || share == 0) {
                return 1; // 나누는 방법이 하나뿐이므로 1을 반환
            }

            // 재귀적인 경우:
            // 1. share 개수의 구슬을 선택하고, 나머지 (balls - 1) 개에서 (share - 1) 개를 선택하는 경우
            // 2. share 개수의 구슬을 선택하지 않고, 나머지 (balls - 1) 개에서 share 개를 선택하는 경우
            return combination(balls - 1, share - 1) + combination(balls - 1, share);
            // 두 경우의 수를 더하여 가능한 모든 나누는 방법의 수를 반환
        }
    }
