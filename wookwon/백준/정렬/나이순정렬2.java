package 백준.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class 나이순정렬2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = Integer.parseInt(o1.split(" ")[0]);
                int b = Integer.parseInt(o2.split(" ")[0]);
                if (a < b) {
                    return -1;
                } else if (a > b) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length; i++) {
//            sb.append(str[i]).append("\n");
//        }
//        System.out.println(sb);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < str.length; i++) {
            bw.write(str[i]+"\n");
        }
        bw.close();
    }
}
