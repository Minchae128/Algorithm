package src.Baekjoon.새싹.문자열;

import java.util.Scanner;

public class Baekjoon_2744 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); // 입력받은 문자열 저장
        String output =""; // 최종적으로 출력할 문자열을 저장
        int tmp;

        for(int i = 0; i < input.length(); i++){ //문자열을 검사하기 위해 input의 길이만큼 반복문 실행(한글자씩 tmp에 옮겨서 검사)
            tmp = (int)input.charAt(i); //문자열은 아스키코드(숫자)로 저장되기 때문에 int형으로 변환

            if((65<= tmp) && (tmp <= 90)){ //문자가 65 <= tmp <= 90인 경우(대문자인 경우)
                output += (char)(tmp + 32); //32를 더해서 소문자로 변환
            }else if((97 <= tmp) && (tmp <= 122)){ //문자가 97 <= tmp <= 122인 경우 (소문자인 경우)
                output += (char)(tmp -32); // 32를 빼서 대문자로 변환
            }else {  //그 외의 문자열인 경우
                output += (char)tmp; //그래도 출력
            }
        }
        System.out.println(output); //최종적으로 변환한 글자열인 output을 출력
    }
}