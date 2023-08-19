package src.Programmers.코딩기초트레이닝.Day6;
// 마지막 두 원소

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_list = new int[n];
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = sc.nextInt();
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            a.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            a.add(num_list[num_list.length - 1] * 2);
        }

        System.out.println(a);
    }
}

