package src.Programmers.etc;

public class Lv0_글자이어붙여문자열만들기 {
    class Solution {
        public String solution(String my_string, int[] index_list) {
            String answer = "";

            for (int i = 0; i < index_list.length; i++) {
                answer += my_string.charAt(index_list[i]);
            }

            return answer;
        }
    }
}

/*
* answer는 결과 문자열을 저장하는 변수
* 초기값은 빈 문자열("")로 설정
*
* 반복문을 사용하여 index_list의 원소들을 하나씩 순회
* i은 0부터 시작하여 index_list의 길이-1까지 반복
*
* index_list의 원소인 index_list[i]를 가져옴
*
* my_string에서 해당하는 인덱스 index_list[i]의 글자를 가져와 answer에 붙임
*
* 반복문이 끝나면 모든 인덱스에 해당하는 글자들을 이어 붙인 answer 반환*/환