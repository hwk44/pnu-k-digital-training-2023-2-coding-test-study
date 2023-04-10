package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 동전0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer coin = Integer.parseInt(st.nextToken());
        Integer price = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < coin; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());
        int result = 0;
        for (int item : list) {
            if (price/item >= 1) {
                result += price/item;
                price = price%item;
            }
            if (price == 0)
                break;
        }

        System.out.println(result);

    }
}
