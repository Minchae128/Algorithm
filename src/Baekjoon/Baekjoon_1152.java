package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine(); //문자열 입력 받기
        String[] arr = n.split(" "); //공백을 기준으로 나눠서 배열에 저장
        if (arr.length == 0) { //만약 아무것도 입력하지 않았다면 배열의 크기가 0이므로 배열[0] 이런식으로 접근하면 에러가 뜨므로 아예 0을 프린트 해주고 프로그램을 종료합니다.
            System.out.println(0);
            System.exit(0); //프로그램 강제 종료
        }
        if (arr[0] == "") { //배열의 맨 앞이 공백이면 공백은 단어가 아니므로 길이 -1
            System.out.println(arr.length - 1);
        }  else { //그 외에는 정상적으로 길이 출력
            System.out.println(arr.length);
        }
    }
}

/*
* public class Baekjoon_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.split(" ");

        System.out.println(arr.length);
    }
}
예외를 생각하지 못하고 코딩했다;;*/