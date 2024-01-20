package src.Programmers.etc;

public class Lv0_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n); //int n을 String으로 변환

        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
}