package src.Programmers.etc;

public class Lv0_문자열의뒤의n글자 {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length()-n);

        return answer;
    }
}

// 1) substring
// java.lang.String클래스의 substring()메스드는 문자열의 특정 부분을 잘라내는 데 사용