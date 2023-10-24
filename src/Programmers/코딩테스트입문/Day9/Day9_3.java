package src.Programmers.코딩테스트입문.Day9;

public class Day9_3 {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");

        for(int i = 0; i< arr.length; i++){
            if (arr[i].equals("5")) { // 문자열 비교에는 equals 메소드를 사용해야 합니다.
                answer += "2";
            } else if (arr[i].equals("2")) {
                answer += "0";
            } else if (arr[i].equals("0")) {
                answer += "5";
            }
        }
        return answer;
    }
}