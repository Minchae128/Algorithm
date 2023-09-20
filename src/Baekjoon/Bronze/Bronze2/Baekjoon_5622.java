package src.Baekjoon.Bronze.Bronze2;
//다이얼
/*주의할점
 * 1. 입력은 대문자로 이루어져있다.
 * 2. 시간의 합을 구하는 문제*/

import java.util.Scanner;


public class Baekjoon_5622 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); //문자열 입력 받기

        int count = 0;
        int k = n.length();

        for (int i = 0; i < k; i++) {
            switch (n.charAt(i)) {

                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;

                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;

                case 'G':
                case 'H':
                case 'I':
                    count += 5;
                    break;

                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;

                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;

                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;

                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;

                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}
