package src.Baekjoon.Bronze.Bronze5;

import java.util.Scanner;

public class Baekjoon_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + (a + b));

        }
    }
}

/*
* import java.util.Scanner;

public class Baekjoon_11021 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] sum = new int[n];

    for(int i = 0; i <n; i++ ){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
        sum[i] = a[i]+b[i];
    }
        for(int j=0; j<a.length; j++){
            System.out.println("Case #"+j+" :"+sum[j]);
        }

    }
}
배열에 저장해서 출력하려고 했는데 출력시 case가 0부터 나오게 되서 틀림
너무 복잡하게 생각하는 것 같다 조금더 간단하게 만들 수 있도록 더 많이 풀어봐야 겠다./
 */