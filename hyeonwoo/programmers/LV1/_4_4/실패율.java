package programmers.LV1._4_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 실패율 {

    /*
    전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 
    스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 
    높은 스테이지부터 내림차순으로 
    스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
    같은 실패율은 오름차순으로
    N	stages	result
    5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
    4	[4,4,4,4,4]	[4,1,2,3]*/

    public static int[] solution(int n, int[] stages) {
        double[] answer = new double[n];
        Arrays.sort(stages);

        for (int i = 1; i <= n; i++) {
            int cnt = 0; // 현재 단계
            int pass = 0; // 지나간 사람들
            for (int j = 0; j < stages.length; j++) {
                if(i == stages[j]) cnt ++;
                if(stages[j] >= i) pass++;
            }
            answer[i-1] = (double) cnt/pass;
        }
        for (double i : answer) {
            System.out.println(i);
        }




        return null;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6,2,4,3,3};
        solution(5,stages);
    }
}
