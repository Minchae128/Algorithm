package src.Programmers.etc;

public class Lv0_길이에따른연산 {
    public int solution(int[] num_list) {
        int answer = 0;

        if (11 <= num_list.length) {
            for (int i = 0; i < num_list.length; i++) {
                answer =+ num_list[i];
            }
        } else if (num_list.length <= 10) {
            for (int j = 0; j < num_list.length; j++) {
                answer = answer * num_list[j];
            }
        }
        return answer;
    }
}
