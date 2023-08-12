package src.Programmers.코딩기초트레이닝.Day4;
// 조건 문자열

import java.util.Scanner;

public class Day4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ineq = sc.nextLine();
        String eq = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                result =  n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                result = n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                result = n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                result = n < m ? 1 : 0;
            }
        }
        System.out.println(result);


    }
}
