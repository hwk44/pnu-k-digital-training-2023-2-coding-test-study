package 백준.Week01_그리디알고리즘;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        String s = "80875542";

        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
