package src.Programmers.etc;

public class Lv0_카운트업 {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기 계산
        int size = end_num - start_num + 1;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = start_num++;
        }
        return answer;
    }
}