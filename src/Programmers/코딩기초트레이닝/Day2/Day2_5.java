package src.Programmers.코딩기초트레이닝.Day2;
//문자열 겹쳐쓰기

import java.util.Scanner;

public class Day2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 my_string 입력 받기
        String my_string = sc.nextLine();

        // 사용자로부터 overwrite_string 입력 받기
        String overwrite_string = sc.nextLine();

        // 사용자로부터 s 입력 받기
        int s = sc.nextInt();

        String answer = "";

        // my_string에서 첫 s개의 문자열을 answer에 추가
        answer = my_string.substring(0, s);

        // overwrite_string을 answer에 추가
        answer += overwrite_string;

        // 겹쳐쓰지 않은 my_string의 나머지 부분을 answer에 추가
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());

        // 결과 출력
        System.out.println(answer);
    }
}

/*
* my_string: 기존의 문자열
overwrite_string: 겹쳐쓸 문자열
s: 겹쳐쓸 문자열의 시작 위치
문제의 요구사항은 my_string 문자열의 일부를 겹쳐쓰는 것입니다.
따라서 우리는 다음과 같은 알고리즘을 사용할 수 있습니다:

1. my_string의 첫 s개의 문자열을 answer에 추가합니다.
   이를 위해 substring() 메서드를 사용하여 my_string의 일부를 추출하여 answer에 할당합니다.
2. overwrite_string을 answer에 추가합니다.
   단순히 += 연산자를 사용하여 answer에 overwrite_string을 추가합니다.
3. 겹쳐쓰지 않은 my_string의 나머지 부분을 answer에 추가합니다.
   s + overwrite_string.length()를 시작 인덱스로 사용하여 my_string에서 나머지 부분을 추출한 후, answer에 추가합니다.
4. 최종적으로 구성된 answer를 반환합니다.*/
