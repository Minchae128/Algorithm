package src.Programmers.etc;

public class Lv0_문자열안에문자열 {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}

//String 클래스의 contains() 메소드 사용
// contains() : 문자안에 포함하는지 boolean 값으로 return 하는 메소드
