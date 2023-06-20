package src.Baekjoon.Bronze.Bronze2;

import java.util.Scanner;

public class Baekjoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 입력 받을 숫자 개수
        int[] b = new int[a];  // 입력 받은 숫자를 저장할 배열
        int count = 0;  // 소수의 개수를 세는 변수

        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();  // 숫자를 배열에 저장
        }

        for (int i = 0; i < b.length; i++) {
            int num = b[i];  // 배열에서 하나의 숫자를 가져옴
            boolean isPrime = true;  // 소수 여부를 저장하는 변수

            if (num < 2) {  // 숫자가 2보다 작으면 소수가 아님
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {  // 숫자가 j로 나누어 떨어지면 소수가 아님
                        isPrime = false;
                        break;  // 더 이상 나눌 필요가 없으므로 반복문 종료
                    }
                }
            }
            if (isPrime) {  // 소수인 경우 count를 증가시킴
                count++;
            }
        }
        System.out.println(count);  // 소수의 개수 출력
    }
}

