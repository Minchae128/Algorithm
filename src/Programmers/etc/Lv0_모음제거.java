package src.Programmers.etc;

public class Lv0_모음제거 {
        public String solution(String my_string) {
            // 결과 문자열을 구성하기 위해 StringBuilder 사용
            StringBuilder answer = new StringBuilder();

            // 주어진 문자열을 문자 배열로 변환
            char[] array_word = my_string.toCharArray();

            // 각 문자에 대해 반복
            for (int i = 0; i < array_word.length; i++) {
                // 현재 문자
                char currentChar = array_word[i];

                // 모음이 아닌 경우에만 결과에 추가
                // 'a', 'e', 'i', 'o', 'u' 중 하나가 아닌 경우에만 결과 문자열에 추가
                if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                    // StringBuilder를 사용하여 문자열을 구성
                    answer.append(currentChar);
                }
            }

            // StringBuilder를 String으로 변환하여 최종 결과 반환
            return answer.toString();
        }
}
