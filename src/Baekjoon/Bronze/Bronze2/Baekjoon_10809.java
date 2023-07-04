package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i = 0; i<arr.length; i++){
            arr[i] = -1; // -1로 초기화 된 배열 (문자열 s에 각 문자의 위치를 표현하는 배열이다.)
        }

        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){ // for문 이용해서 문자열의 각 문자 검사
            char ch = s.charAt(i); // charAt()메소드를 사용하여 문자를 추출한 뒤 ch 라는 변수에 저장

            if(arr[ch - 'a'] == -1){ // arr 원소 값이 -1인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr){ // 배열 출력
            System.out.print(val + " ");
        }
    }
}

