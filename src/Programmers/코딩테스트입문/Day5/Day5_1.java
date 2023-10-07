package src.Programmers.코딩테스트입문.Day5;
//옷가게 할인 받기
/*if의 가격 조건이 중요함.  (첫번째부터 내려오며 실행되므로)

>= (이상)의 조건이므로 가장 큰 수를 첫 번째 조건으로 걸러야 한다.

이하인 경우, 가장 작은 수부터 조건을 지정해야 함. => 항상 기억해서 풀이하자!*/


public class Day5_1 {
    public int solution(int price) {
        int answer = 0;

        if(500000 <= price){
            answer = (int)(price * 0.8);
        }else if(300000 <= price){
            answer = (int)(price * 0.9);
        }
        else if(100000 <= price){
            answer = (int)(price * 0.95);
        }
        else{
            return price;
        }
        return answer;
    }
}