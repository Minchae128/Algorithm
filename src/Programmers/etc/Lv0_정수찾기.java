package src.Programmers.etc;

public class Lv0_정수찾기 {
    class Solution {
        public int solution(int[] num_list, int n) {
            int answer = 0;

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] == n) {
                    answer = 1;
                }
            }
            return answer;
        }
    }
}