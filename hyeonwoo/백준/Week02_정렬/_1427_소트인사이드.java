package 백준.Week02_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1427_소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
//        char[] c = s.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        System.out.println(sb);
    }
}
