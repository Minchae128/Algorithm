package src.Programmers.etc;

public class Lv0_머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){
            if(height < array[i]){
                answer++;
            }
        }
        return answer;
    }
}
