package 교재.Week02_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 위에서아래로 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(br.readLine());
//        Integer n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
