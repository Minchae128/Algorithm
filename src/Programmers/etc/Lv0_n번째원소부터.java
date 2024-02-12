package src.Programmers.etc;

public class Lv0_n번째원소부터 {
    public int[] solution(int[] num_list, int n) {
        // 반환할 배열의 크기를 계산합니다.
        int[] answer = new int[num_list.length - n + 1];

        // num_list에서 n번째 원소부터 마지막 원소까지 반복합니다.
        for(int i = n; i <= num_list.length; i++) {
            // answer 배열에 값을 복사합니다.
            // 여기서 i - n은 answer 배열의 인덱스를 나타내며, num_list에서의 인덱스는 i - 1입니다.
            answer[i - n] = num_list[i - 1];
        }

        // 결과 배열을 반환합니다.
        return answer;
    }
}
