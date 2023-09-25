package src.Programmers.코딩테스트입문.Day2;
/*분수의 덧셈
* 이 문제에서는 두 분수를 더한 결과를 기약 분수(분자와 분모의 최대공약수가 1인 분수)로 나타내야 합니다.
* 각 분수는 분자(numer)와 분모(denom)로 주어지며,
* 두 분수를 더한 후에 분자와 분모를 순서대로 배열에 담아 반환해야 합니다.*/

public class Day2_3 {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            // 분모가 0인 경우 예외 처리
            if (denom1 == 0 || denom2 == 0) {
                throw new IllegalArgumentException("분모는 0이 될 수 없습니다.");
            }

            // 최대공약수(GCD)를 구하는 함수를 호출하여 최대공약수를 계산합니다.
            int gcd = gcd(denom1, denom2);

            // 분모의 최소공배수(LCM)를 계산합니다.
            // 최소공배수는 두 분모를 최대공약수로 나눈 것을 곱한 값입니다.
            int lcm = (denom1 / gcd) * denom2;

            // 각 분자를 고려하여 두 분수를 더합니다.
            int numer = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));

            // 더한 분자와 분모의 최대공약수를 구합니다.
            int gcd2 = gcd(numer, lcm);

            // 최종 결과를 기약 분수로 만들어 반환합니다.
            int[] answer = {numer / gcd2, lcm / gcd2};
            return answer;
        }

        // 최대공약수(GCD)를 구하는 함수
        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
}
