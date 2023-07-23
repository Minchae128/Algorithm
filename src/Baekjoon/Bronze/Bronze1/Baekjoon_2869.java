package src.Baekjoon.Bronze.Bronze1;

import java.util.Scanner;

public class Baekjoon_2869 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int v = in.nextInt();

        int day = (v - b) / (a - b);

        //나머지가 있을 경우 (잔여 블록이 있을 경우)

        if ((v - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
