package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int result = 0;
        int num = 0;
        boolean negative = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // 'c'의 ASCII 코드에서 문자 '0'의 ASCII 코드를 뺌.
                                            // 예를 들어 문자 'c'가 '5'이면 해당 ASCII 코드는 53이고 ASCII 코드 '0'은 48입니다.
                                            // 따라서 c - '0'은 5가 됩니다. num이면 예를 들어 이미 값이 3인 경우 이 코드 행을 실행한 후
                                            // num의 값은 35(3 * 10 + 5)가 됨.
                                            //10을 곱하는 이유? 자릿수를 이동시키기 위해서. ex)기존에 num에 3이 저장돼있으면 10곱하고 5 더해줘야 35가 됨.
            } else if (c == '+') {
                result += (negative ? -num : num);
                num = 0;
            } else if (c == '-') {
                result += (negative ? -num : num);
                num = 0;
                negative = true;
            }
        }
        result += (negative ? -num : num);
        System.out.println(result);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
    }
}
