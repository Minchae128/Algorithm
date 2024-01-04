package src.Programmers.etc;

public class Lv0_조건에맞게수열변환3 {
    class Solution {
        public int[] solution(int[] arr, int k) {
            int[] answer = {};

            if (k % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] += k;
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] *= k;
                }
            }

            return arr;
        }
    }
}