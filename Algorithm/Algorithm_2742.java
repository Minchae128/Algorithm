package Algorithm;

import java.util.Scanner;

public class Algorithm_2742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = n - i;

            System.out.println(sum);
        }
    }
}
