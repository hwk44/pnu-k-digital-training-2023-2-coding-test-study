package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 잃어버린괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] expression = br.readLine().split("-");
        int result = Integer.MAX_VALUE; // 들어올 수 없는 값으로 초기화.(조건식에 사용하기 위해서)
        for (int i = 0; i < expression.length; i++){
            String[] plus = expression[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }
            // 최초한번만 (expression[i]의 합)을 result에 초기화.
            if (result == Integer.MAX_VALUE) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
