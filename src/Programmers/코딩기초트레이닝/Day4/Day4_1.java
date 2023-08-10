package src.Programmers.코딩기초트레이닝.Day4;
// n의 배수
import java.util.Scanner;

public class Day4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        if(num%n == 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }


    }
}
