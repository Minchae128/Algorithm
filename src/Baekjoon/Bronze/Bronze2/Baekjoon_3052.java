package src.Baekjoon.Bronze.Bronze2;

import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon_3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(in.nextInt() % 42);
            //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }

        in.close();
        System.out.print(h.size());
    }
}

/*
HashSet

HashSet 은 자바 Collection 중 Set 의 파생클래스이다.
set 을 집합이라고 생각하면 되는데, HashSet 의 경우 몇 가지 특징이 있다.

중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다.

HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다. 만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.

이 문제에서는 결국 나머지 값에서 "서로 다른" 개수를  세면 되는 것이기 때문에 HashSet 을 이용하면 자연스럽게 나머지 값이 HashSet 원소에 이미 저장되어있어 중복일 경우 저장이 되지 않고 HashSet 에 없으면 저장한다.
즉, HashSet 에 저장하면서 들어간 원소의 개수가 HashSet 의 사이즈가 되는 것이고, 이는 결국 "서로 다른 나머지"가 되는 것이다.

HashSet.add() 매소드는 HashSet에 저장하는 메소드
* HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환*/

