package src.Programmers.코딩기초트레이닝.Day1;

import java.util.Scanner;

//문자열 출력하기
public class Day1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(str);
        }
    }
}
