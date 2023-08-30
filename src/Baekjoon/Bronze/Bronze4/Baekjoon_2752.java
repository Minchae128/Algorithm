package src.Baekjoon.Bronze.Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2752 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i<3; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
