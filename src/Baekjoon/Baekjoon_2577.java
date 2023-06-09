package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = a * b * c; // 세값을 곱하여 변수 int m에 저장
        String str = Integer.toString(m); //int m값을 String 으로 변환

        for (int i = 0; i < 10; i++) {  //0~9까지 각각 수를 검사
            int count = 0;
            for (int j = 0; j < str.length(); j++) { //for문을 통해 str의 길이만큼 모든 요소 검사
                if ((str.charAt(j) - '0') == i) {   // 해당 인덱스의 문자와 i가 같은 수가 몇개 있는지 확인 후 같은 경우 +1
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
