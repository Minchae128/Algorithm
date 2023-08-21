package src.Programmers.코딩기초트레이닝.Day6;
// 수 조작하기 1

import java.util.Scanner;

public class Day6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        String control = sc.nextLine();  // Read the control string
        String[] arr = control.split("");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("w")) {
                n += 1;
            } else if (arr[i].equals("s")) {
                n -= 1;
            } else if (arr[i].equals("d")) {
                n += 10;
            } else if (arr[i].equals("a")) {
                n -= 10;
            }
        }

        System.out.println(n);  // Print the final value of n
    }
}
