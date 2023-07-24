package src.Baekjoon.Bronze.Bronze5;


import java.io.*;

public class BaekJoon_5522 {

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] =  Integer.parseInt(bf.readLine()); // 입력값을 받아 정수로 변환하여 배열에 저장합니다.
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
