package src.Baekjoon.silver.silver5;

import java.util.*;

// 점 클래스를 생성합니다.
class Point implements Comparable<Point> {
    int x, y;

    // 생성자를 이용해 x와 y 좌표를 초기화합니다.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Comparable 인터페이스의 compareTo 메서드를 오버라이드하여 정렬 기준을 지정합니다.
    @Override
    public int compareTo(Point other) {
        // x 좌표가 다르다면 x 좌표를 기준으로 비교합니다.
        if (this.x != other.x) {
            return this.x - other.x;
        }
        // x 좌표가 같다면 y 좌표를 기준으로 비교합니다.
        return this.y - other.y;
    }
}

public class Baekjoon_11650 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 점의 개수를 입력받습니다.

        List<Point> points = new ArrayList<>(); // 점들을 저장할 리스트를 생성합니다.

        // N개의 점 좌표를 입력받아 리스트에 추가합니다.
        for (int i = 0; i < n; i++) {
            int x = in.nextInt(); // x 좌표를 입력받습니다.
            int y = in.nextInt(); // y 좌표를 입력받습니다.
            points.add(new Point(x, y)); // 생성한 점을 리스트에 추가합니다.
        }

        // 정렬을 수행합니다.
        Collections.sort(points); // 점들을 정렬합니다.

        // 정렬된 점들을 출력합니다.
        for (Point point : points) {
            System.out.println(point.x + " " + point.y); // 정렬된 점의 좌표를 출력합니다.
        }
    }
}
