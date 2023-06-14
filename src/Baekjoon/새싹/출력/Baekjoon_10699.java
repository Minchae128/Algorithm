package src.Baekjoon.새싹.출력;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Baekjoon_10699 {

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat nowTime = new SimpleDateFormat("YYYY-MM-DD");

        String nowFormat = nowTime.format(now);

        System.out.println(nowFormat);
    }
}
