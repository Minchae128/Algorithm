package src.Programmers.코딩기초트레이닝.Day5;
// 원소들의 곱과 합
import java.util.Scanner;

public class Day5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력받을 정수 리스트의 길이를 저장합니다.
        int[] num_list = new int[n]; // 입력받을 정수 리스트를 선언합니다.

        // 정수 리스트의 각 원소를 입력받습니다.
        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }

        int product = 1; // 원소들의 곱을 계산하기 위한 변수를 초기화합니다.
        int sum = 0; // 원소들의 합을 계산하기 위한 변수를 초기화합니다.

        // 정수 리스트의 각 원소를 순회하면서 곱과 합을 계산합니다.
        for (int num : num_list) {
            product *= num; // 원소를 곱해나갑니다.
            sum += num; // 원소를 더해나갑니다.
        }

        int squaredSum = sum * sum; // 합의 제곱을 계산합니다.

        // 곱이 합의 제곱보다 작으면 1을 출력하고 그렇지 않으면 0을 출력합니다.
        if (product < squaredSum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
