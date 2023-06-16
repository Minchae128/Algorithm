package src.Baekjoon.Bronze.Bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1546 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double arr[] = new double[in.nextInt()];
        //오차범위 때문에 반드시 연산 할때는 최소한 자료형 1개 이상은 double형으로 써야한다.
        // why? 자동으로 형변환이 되면서 자료형이 큰쪽으로 (int -> double)변환되기 때문

        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble(); // 배열에 입력받아 저장
        }
        in.close();

        double sum = 0; //sum을 double형으로 해주었다.
        Arrays.sort(arr); //sort를 사용해서 정렬

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100);
        }
        System.out.print(sum / arr.length);
    }
}

