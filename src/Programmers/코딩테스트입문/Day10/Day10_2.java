package src.Programmers.코딩테스트입문.Day10;

public class Day10_2 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int a = 0;

        for(int i= 0; i<num_list.length / n; i++){
            for(int j = 0; j <n; j++){
                answer[i][j] = num_list[a++];
            }

        }
        return answer;
    }
}