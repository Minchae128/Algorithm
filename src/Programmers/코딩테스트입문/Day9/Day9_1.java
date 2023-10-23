package src.Programmers.코딩테스트입문.Day9;

public class Day9_1 {
    public int solution(int hp) {
        int answer = 0;
         answer += (hp /5);
         hp %= 5;

         answer +=(hp /3);
         hp %= 3;

         answer += (hp /1);

        return answer;
    }
}

/*    public int solution(int hp) {
        int answer = 0;
        int a = 0;
        int b = 0;

        if(hp % 5 != 0){
         answer = hp / 5;
            a = hp % 5;
            if (a % 3 != 0 ){
                answer += a / 3;
                b = a % 3;
                if(b % 1 == 0){
                    answer += b;
                }
            }else{
                answer += a / 3;
            }
        }else{
            answer = hp / 5;
        }

        return answer;
    }
}*/