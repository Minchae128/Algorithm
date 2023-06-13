package src.Baekjoon.새싹.배열;

import java.util.Scanner;

public class Baekjoon_10871 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //입력 갯수
    int a = sc.nextInt(); // a보다 작은수
    int[] arr = new int[n]; // 입력받는 수 저장하는 배열

    for(int i = 0; i<n; i++){ // for을 통해 숫자 입력 받기
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){ // 숫자 비교
        if(arr[i] <a){
            System.out.print(arr[i]+" ");
        }
    }
    }
}
