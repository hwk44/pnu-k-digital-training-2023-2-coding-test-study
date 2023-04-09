package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int peopleCnt = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] time = new int[peopleCnt];
        for (int i = 0; i < peopleCnt; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);
        int result = 0;
        int j = time.length;
        for (int i = 0; i < time.length; i++) {
            result += time[i]*j;
            j--;
        }

        System.out.println(result);
    }
}
