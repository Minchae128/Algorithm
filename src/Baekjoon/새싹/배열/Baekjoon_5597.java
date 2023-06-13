package src.Baekjoon.새싹.배열;

import java.util.Scanner;

public class Baekjoon_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];

        for (int i = 0; i <28; i++) {
            int success = sc.nextInt();
            arr[success] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

/*
* public class Baekjoon_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];

        for (int i = 0; i <28; i++) {
            int success = sc.nextInt();
            arr[success] = 1;
        }
        for (int i = 1; 1 < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
런타임 오류가 나왔다
* for (int i = 1; 1 < arr.length; i++) 이부분에서
* i<arr.length로 코딩해야하는데 1<arr.length로 작성해서 나온 에러였다.*/