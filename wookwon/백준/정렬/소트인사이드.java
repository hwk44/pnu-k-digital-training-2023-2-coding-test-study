package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[]str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        String answer="";
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        System.out.println(answer);
    }
}
