package src.Programmers.etc;

public class Lv0_배열원소의길이 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];

            int a = strlist.length;

            for (int i = 0; i < a; i++) {
                answer[i] = strlist[i].length();
            }

            return answer;
        }
    }
}