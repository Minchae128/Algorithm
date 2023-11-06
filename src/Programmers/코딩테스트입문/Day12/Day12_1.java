package src.Programmers.코딩테스트입문.Day12;

public class Day12_1 {
    public String solution(String my_string) {
        String answer = "";
        String[] replace = {"a", "e", "i", "o", "u"};
        for(int i = 0; i<replace.length; i++) {
            if( my_string.contains(replace[i])) {
                answer = my_string.replaceAll(replace[i], "");
                my_string = answer;
            } else {
                answer =my_string;
            }
        }


        return answer;
    }
}