package src.Programmers.코딩테스트입문.Day6;


public class Day6_3 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int a = 0;
        int b = 0;

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                a++;
            }else if(num_list[i] % 2 != 0){
                b++;
            }
        }
        answer = new int[]{a,b};
        return answer;
    }
}