package src.Programmers.코딩기초트레이닝.Day1;
//대소문자 바꿔서 출력하기
import java.util.Scanner;

//문자열 출력하기
public class Day1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";

        //아스키 코드표를 기준으로 대문자의 값과 소문자의 값이 32가 차이가 나는 점을 이용한다
        for(char c : str1.toCharArray()){
            if(c>=65&&c<=90){ //대문자를 소문자로 변경
                str2+=(char)(c+32);
            }
            else if(c>=97&&c<=122){ //소문자를 대문자로 변경
                str2+=(char)(c-32);
            }
        }//for_end
        System.out.println(str2);
    }
}
