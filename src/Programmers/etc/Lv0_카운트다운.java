package src.Programmers.etc;

public class Lv0_카운트다운 {
    public int[] solution(int start_num, int end_num) {
        int size = (start_num - end_num + 1);
        int[] answer = new int [size];

        for (int i = 0; i < size; i++) {
            answer[i] = start_num--;
        }
        return answer;
    }
}