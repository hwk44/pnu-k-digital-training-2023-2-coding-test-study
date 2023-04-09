package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
// Comparator의 Compare 메서드 구현부 잘 이해가 가지 않음.
public class 회의실배정 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        // Comparator Override 하여 사용.
//      Arrays.sort(time, new Comparator<int[]>() {
//
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[1] == o2[1])
//                    return o1[0] - o2[0];
//
//                return o1[1] - o2[1];
//            }
//
//        });

        // 람다식 사용.
        Arrays.sort(time, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count = 0;
        int prev_end_time = 0;

        for (int i =0; i < N; i++) {
            if (prev_end_time <= time[i][0]) {  // 전의 끝나는 시간이 현재 시작하는 시간보다 작거나 같다면..
                prev_end_time = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
