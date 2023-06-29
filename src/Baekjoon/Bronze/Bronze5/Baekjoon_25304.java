package src.Baekjoon.Bronze.Bronze5;

import java.util.Scanner;

public class Baekjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tal = sc.nextInt(); // 영수증에 적힘 총 금액
        int n = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            tal = tal - (a * b);
        }
        if(tal == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
