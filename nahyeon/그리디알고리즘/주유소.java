package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 주유소 { // 13305번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] roadlen = new long[n - 1];
        long[] liter = new long[n];
        for (int i = 0; i < n - 1; i++){
            roadlen[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            liter[i] = sc.nextInt();
        }

        long price = liter[0]; // 0번째 가격
        long result = 0;
        for (int i = 0; i < roadlen.length; i++){
            if (liter[i] < price)
                price = liter[i];
            result += price * roadlen[i];
        }
        System.out.println(result);



    }
}
