package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int a = Integer.parseInt(o1[0]);
                int b = Integer.parseInt(o2[0]);
                if (a < b) {
                    return -1;
                } else if (a > b) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str[i][0]).append(" ").append(str[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}