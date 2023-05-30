package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(sc.hasNextLine()) {
            String n = sc.nextLine();

            System.out.println(n);
        }
    }

}
/*hasNextLine()은 다음에 읽을 값이 있으면 true를 리턴하고 없으면 false를 리턴한다!
입력 값이 공백이여도 공백 그대로 출력해준다!*/

/*
* import java.util.Scanner;

public class Baekjoon_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;

        n = sc.nextLine();

        System.out.println(n);
    }

}
틀림...공백입력을 처리해주지 않았기 때문*/