package src.Programmers.etc;

public class Lv0_문자열의앞의n글자 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);

        return answer;
    }
}