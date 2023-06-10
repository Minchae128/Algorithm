package src.Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_15552 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}


/*
* 시간 초과가 나와서 고쳐보았다.
* public class Baekjoon_15552 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for(int i =0; i < n; i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
    }

    for(int i =0; i<n; i++){
        System.out.println(a[i]+b[i]);
    }
    }
}
*/
