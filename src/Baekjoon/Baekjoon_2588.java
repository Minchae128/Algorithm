package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        System.out.println(a * (b.charAt(2) -'0')); // -'0' 해주는 이유는 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것
        System.out.println(a * (b.charAt(1) -'0')); // -'0' 해주는 이유는 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것
        System.out.println(a * (b.charAt(0) -'0')); // -'0' 해주는 이유는 우리가 문자로 저장된 숫자가 아닌 우리가 보는 숫자 그대로의 값을 쓰기 위한 것
        System.out.println(a * Integer.parseInt(b)); //Integer.parsInt()을 통해 문자열을 int형으로 바꿔주어 A와 곱해준 값을 출력하기 위함
    }
}
