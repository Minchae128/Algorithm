package src.Programmers.코딩기초트레이닝.Day4;
// 공배수
import java.util.Scanner;

public class Day4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

            if(number % n == 0 && number % m == 0 ){
                System.out.println("1");
            }else {
                System.out.println("0");
            }


    }
}
