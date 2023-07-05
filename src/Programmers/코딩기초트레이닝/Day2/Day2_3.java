package src.Programmers.코딩기초트레이닝.Day2;

import java.util.Scanner;

public class Day2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int a = str.length();

        for(int i = 0; i<a; i++){
            System.out.println(str.charAt(i));
        }
    }
}
