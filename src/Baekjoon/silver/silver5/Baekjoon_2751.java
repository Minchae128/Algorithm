package src.Baekjoon.silver.silver5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_2751 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>(); // 정수를 저장할 리스트 객체를 생성한다.

        for (int i = 0; i < N; i++) {
            list.add(in.nextInt()); // 입력된 정수를 리스트에 추가한다.
        }

        Collections.sort(list); // 리스트를 오름차순으로 정렬한다.

        for (int value : list) {
            sb.append(value).append('\n'); // 정렬된 정수들을 StringBuilder에 추가한다.
        }
        System.out.println(sb); // 정렬된 결과를 출력한다.
    }
}
