package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 4 == 0) {
            if ( n % 400 == 0) {
                System.out.println("1");
            } else if (n % 100 == 0){
                System.out.println("0");
            }else {
                System.out.println("1");
            }
        }else {
            System.out.println("0");
        }
    }
}

/*
* import java.util.Scanner;

public class Baekjoon_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n % 4 == 0 && n % 100 == 0 )|| n % 400 == 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
* 윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미하고, 그중 100으로 나눈 값이 0인 것은 윤년에서
* 제외하나, 400으로 나눈 값이 0인 것은 윤년으로 포함 그외는 평년이다.
* 구조는
* 1-1 단계 : 4의 배수일 경우 - if ( year%4==0 )

    2-1 단계 : 4의 배수이면서 400의 배수일 경우 - if ( year%400 == 0 )

    2-2 단계 : 4의 배수이면서 100의 배수일 경우 - else if ( year%100 == 0 )

    2-3 단계 : 2단계 조건식 나머지 - else

1-2 단계 : 1 단계 조건식 나머지 - else*/
