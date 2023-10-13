package src.Programmers.코딩테스트입문.Day6;


public class Day6_4 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr;
        arr = my_string.split("");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < n; j++){
                answer += arr[i];
            }
        }
        return answer;
    }
}