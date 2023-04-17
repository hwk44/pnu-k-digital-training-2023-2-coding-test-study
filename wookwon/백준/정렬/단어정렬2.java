package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 단어정렬2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length(); // 먼저 길이 순으로 비교 및 정렬
                } return a.compareTo(b); // 그 다음에 사전 순 정렬
            }
        });
        for (int i = 0; i < words.length; i++) {
            if(i>0 && words[i].equals(words[i-1])){
                continue;
            }
            System.out.println(words[i]);
        }
    }
}
