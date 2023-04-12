package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 보물2 { // 1026번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // readLine 한 줄만 읽는거
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(st.nextToken()); //st의 token을 하나씩 잘라서 integer로 변경
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int result = 0;
        for(int i=0; i<n; i++){
            result = a[i] * b[i] + result;
        }
        System.out.println(result);

    }
}
