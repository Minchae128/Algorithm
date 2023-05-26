package src.Baekjoon;

import java.util.Scanner;

public class Baekjoon_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            arr[i]=in.nextInt();
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
            if(arr[i] >max){
                max = arr[i];
            }
        }
        System.out.print(min+" "+max);
    }
}
