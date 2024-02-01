package src.Programmers.etc;

public class Lv0_문자열의뒤의n글자 {
    public String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length()-n);

        return answer;
    }
}