package src.Programmers.코딩기초트레이닝.Day7;


public class Day7_1 {
    // 이 메서드는 'arr' 배열과 2차원 배열 'queries'를 입력으로 받습니다.
    public int[] solution(int[] arr, int[][] queries) {
        // 'queries' 배열의 각 쿼리에 대해 반복합니다.
        for(int i = 0; i < queries.length; i++) {
            // 현재 쿼리에서 지정된 범위를 반복합니다.
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                // 현재 인덱스 'j'가 쿼리의 세 번째 요소로 나누어 떨어지는지 확인합니다.
                if(j % queries[i][2] == 0)
                    // 나누어 떨어지면 'arr' 배열에서 인덱스 'j'의 값을 증가시킵니다.
                    arr[j]++;
            }
        }
        // 모든 쿼리를 처리한 후 수정된 'arr' 배열을 반환합니다.
        return arr;
    }
}

/*
*
* 1. solution 메서드:
        이 메서드는 두 개의 매개변수를 받습니다: 배열 arr과 2차원 배열 queries.
        queries 배열에서 지정된 조건에 따라 arr 배열을 수정합니다.

* 2. 바깥쪽 반복문 (for 루프):
        이 반복문은 queries 배열의 각 쿼리를 반복합니다.

* 3. 안쪽 반복문 (for 루프):
    이 반복문은 현재 쿼리에서 지정된 범위를 반복합니다.
    범위는 queries[i][0]에서 queries[i][1]까지입니다.

* 4. 조건 확인:
        안쪽 반복문 내에서 현재 인덱스 j가 쿼리의 세 번째 요소 (queries[i][2])로 나누어 떨어지는지 확인합니다.
        조건이 참이면 arr 배열에서 인덱스 j의 값을 증가시킵니다.

* 5. 반환문:
        모든 쿼리를 처리한 후 수정된 arr 배열이 반환됩니다.

* 총평으로 이 알고리즘은 주어진 쿼리에 따라 arr 배열의 특정 범위를 반복하며 조건을 만족하는 인덱스의 값을 증가시킵니다.*/