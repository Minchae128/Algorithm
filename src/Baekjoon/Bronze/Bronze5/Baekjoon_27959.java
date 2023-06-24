package src.Baekjoon.Bronze.Bronze5;

import java.util.Scanner;

public class Baekjoon_27959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*100;
        if(b<=c){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
