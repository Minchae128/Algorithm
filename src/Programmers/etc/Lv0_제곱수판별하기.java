package src.Programmers.etc;

public class Lv0_제곱수판별하기 {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= 1000; i++) {
                if (i * i == n) {
                    answer = 1;
                    break;
                } else {
                    answer = 2;
                }
            }
            return answer;
        }
    }


    /*1. n의 범위가 1 ~ 1,000,000까지 이므로 i는 1 ~ 1000까지로 범위 설정
    * 2. i * i가 n이 일치한다면(=제곱수라면)
    *    answer에 1을 저장하고 break로 반복문 종료
    * 3. 제곱수가 아닐 경우 , answer에 2저장*/