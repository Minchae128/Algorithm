package src.Programmers.etc;

public class Lv0_문자열을정수로변환하기 {
    public int solution(String n_str) {
    int answer = 0;

    answer = Integer.parseInt(n_str);
    return answer;
}
}

// 문자열 -> 숫자 : Integer.parseInt(""); / Integer.valueOf("");
// (int)"" -> 문자에서 숫자로
// 숫자 -> 문자열 : Integer.toString(""); / Integer.valueOf("");
//(char)"" -> 숫자에서 문자로

//문자열 -> 문자 : String.valueOf();
//문자 -> 문자열 : ex.chatAt(); / ex.toCharArray();

//실수 -> 정수 : (int)실수double  / (int)float
//정수 -> 실수 : (double)정수 / (float)정수
