package src.Baekjoon.Bronze.Bronze4;

import java.util.Scanner;

public class Baekjoon_15596 {
    long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
