package src.Programmers.코딩테스트입문.Day7;
// ==은 비교하고자 하는 두개의 대상의 주소값 비교
//equals는 비교하고자 하는 두개의 대상의 값 자체를 비교

public class Day7_1 {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(letter)) {
                answer += arr[i];
            }
        }
        return answer;
    }
}
