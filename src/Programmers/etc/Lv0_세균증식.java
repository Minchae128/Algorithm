package src.Programmers.etc;

public class Lv0_세균증식 {
    class Solution {
        public int solution(int n, int t) {

            for (int i = 0; i < t; i++) {
                n *= 2;
            }

            return n;
        }
    }
}