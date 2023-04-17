package BaekJoon.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CoordinateCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        Integer[] sorted = new Integer[n];
        Integer[] origin = new Integer[n];
        Map<Integer, Integer> map = new HashMap();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        int rank = 0;

        for (Integer i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, rank);
                rank++;
            }
        }
        for (Integer i : origin) {
            if (map.containsKey(i))
                sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
