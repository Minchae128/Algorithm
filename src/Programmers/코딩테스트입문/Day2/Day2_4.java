package src.Programmers.코딩테스트입문.Day2;

//배열 두 배 만들기

public class Day2_4 {
        public int[] solution(int[] numbers) {

            for(int i = 0; i< numbers.length; i++){
                numbers[i] += numbers[i] ;
            }
            return numbers;
        }

}
