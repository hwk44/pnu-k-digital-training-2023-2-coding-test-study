package programmers.LV1._4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {

    public static void main(String[] args) {

        int k = 4;
//        int[] score = {10, 100, 20, 150, 1, 100, 200};
//        int[] score = { 100, 20,60, 150, 1, 100, 200};
        int[] score = {300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(solution(k, score));
    }

    public static List solution(int k, int[] score) {
        List answer = new ArrayList<>();

        List<Integer> list = new ArrayList();
        list.add(score[0]);
        answer.add(score[0]);
        for (int i = 1; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
            }
            if (list.size() == k) {
                if (list.get(0) <= score[i]) {
                    list.add(score[i]);
                    if (list.size() > k) list.remove(list.get(0));
                }
            }
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
            answer.add(list.get(0));
        }

//        for (int e : list) {
//            System.out.println(e);
//        }

        return answer;


    }
}
