package src.Programmers.코딩테스트입문.Day8;

public class Day8_2 {

        public String solution(int age) {
            // 결과를 저장할 빈 문자열을 선언
            String answer = "";

            // 주어진 나이를 문자열로 변환
            String ageStr = Integer.toString(age);

            // 주어진 나이를 PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환
            for (int i = 0; i < ageStr.length(); i++) {
                // 현재 자릿수의 문자를 추출
                char digitChar = ageStr.charAt(i);

                // 문자를 숫자로 변환하여 알파벳으로 변환
                int digit = Character.getNumericValue(digitChar);
                char ch = (char) ('a' + digit);

                // 변환된 알파벳을 결과 문자열에 추가
                answer += ch;
            }

            // PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환된 결과 반환
            return answer;
        }
    }
    /*`Integer`와 `Character.getNumericValue`는 Java에서 숫자와 문자 간의 변환을 처리하기 위한 기능입니다.

1. **Integer**: `Integer` 클래스는 정수 값을 문자열로 변환하거나 문자열을 정수 값으로 변환하는 데 사용됩니다. `Integer.toString(age)`는 `age` 변수의 값을 문자열로 변환합니다.

   예를 들어:
   ```java
   int age = 23;
   String ageStr = Integer.toString(age);
   ```

   이렇게 하면 `age`의 값을 "23"이라는 문자열로 변환합니다.

2. **Character.getNumericValue**: `Character.getNumericValue`는 주어진 문자의 숫자 값을 반환합니다. 이 메서드는 문자가 '0'에서 '9' 사이의 숫자인 경우에만 작동합니다.

   예를 들어:
   ```java
   char digitChar = '5';
   int digit = Character.getNumericValue(digitChar);
   ```

   이 코드는 `digitChar` 문자가 '5'이므로 `digit`에는 숫자 5가 저장됩니다.

따라서 코드에서 사용한 `Integer.toString(age)`는 정수를 문자열로 변환하고, `Character.getNumericValue(digitChar)`는 문자를 해당 숫자 값으로 변환하는 데 사용됩니다. 이 두 가지를 함께 사용하여 정수를 문자로 변환하고 그 문자를 숫자로 변환하여 PROGRAMMERS-962 행성에서 사용하는 알파벳으로 변환합니다.*/


    /*
    public String solution(int age) {
        // 결과를 저장할 빈 문자열을 선언
        String answer = "";

        // 주어진 나이를 PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환
        while (age > 0) {
            // 나이의 가장 낮은 자릿수를 추출
            int digit = age % 10;

            // 숫자를 알파벳으로 변환
            char ch = (char) ('a' + digit);

            // 변환된 알파벳을 결과 문자열의 앞에 추가
            answer = ch + answer;

            // 다음 자릿수로 이동하기 위해 나이를 10으로 나눔
            age /= 10;
        }

        // PROGRAMMERS-962 행성에서 사용하는 알파벳 형태로 변환된 결과 반환
        return answer;
    }
}
*/

