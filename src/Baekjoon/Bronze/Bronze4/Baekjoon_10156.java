package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_10156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();
        int M = in.nextInt();

        int sum = K * N;

        if(M <= sum){
            System.out.println(sum - M);
        }else {
            System.out.println("0");
        }
    }
}
