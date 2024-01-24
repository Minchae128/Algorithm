package src.Programmers.etc;

public class Lv0_정수부분 {    public int solution(double flo) {
    int answer = 0;

    answer = (int)flo;

    return answer;
}
}

// 문자열 -> 숫자 : Interger.parseInt(""); / Interger.valueOf("");
// (int)"" -> 문자에서 숫자로
// 숫자 -> 문자열 : Interger.toString(""); / Interger.valueOf("");
//(char)"" -> 숫자에서 문자로

//문자열 -> 문자 : String.valueOf();
//문자 -> 문자열 : ex.chatAt(); / ex.toCharArray();

//실수 -> 정수 : (int)실수double  / (int)float
//정수 -> 실수 : (double)정수 / (float)정수
