package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) { // if end times are equal, sort by start time
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1]; // sort by end time
                }
            }
        });
        int count = 0, end = -1;
        for (int i = 0; i < n; i++) {
            if (time[i][0] >= end) {
                count++;
                end = time[i][1];
            }
        }
        System.out.println(count);

        //람다식으로 정렬할 수도 있다.
//        Arrays.sort(time, (a, b) -> {
//            if (a[1] == b[1]) { // if end times are equal, sort by start time
//                return a[0] - b[0];
//            } else {
//                return a[1] - b[1]; // sort by end time
//            }
//        });
//        int count = 0, end = -1;
//        for (int i = 0; i < n; i++) {
//            if (time[i][0] >= end) {
//                count++;
//                end = time[i][1];
//            }
//        }


        //시간초과
//        int cnt = 1;
//        for (int i = 0; i < time.length; i++) {
//            for (int j = i + 1; j < time.length; j++) {
//                if (time[i][1] - time[i][0] <= time[j][0] - time[i][0]) {
//                    cnt++;
//                    i = j - 1;
//                    break;
//                }
//                //0,1열 같은 경우
//                else if (time[i][0] == time[i][1]) {
//                    if ((time[j][0] == time[i][0] && time[j][1] != time[i][1]) || (time[i][1] - time[i][0] < time[j][0] - time[i][0])) {
//                        cnt++;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(cnt);
    }
}
