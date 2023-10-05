package src.Programmers.코딩테스트입문.Day4;

public class Day4_3 {
    public int solution(int slice, int n) {
        int answer = 0;

        if(slice < n){
            if((n % slice) != 0){
                answer = (n / slice) + 1;
            }else{
                answer = (n /slice);
            }
        }else{
            if((n % slice) != 0){
                answer = (n / slice) + 1;
            }else{
                answer = (n /slice);
            }
        }
        return answer;
    }
}
