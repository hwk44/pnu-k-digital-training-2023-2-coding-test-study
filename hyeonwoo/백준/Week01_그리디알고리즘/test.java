package 백준.Week01_그리디알고리즘;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
//        String s = "80875542";
//
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//
//        for (int i = 0; i < ch.length; i++) {
//            System.out.println(ch[i]);
//        }

        int [] a = {1, 2, 3};
        int[] b = a;

        a[0] = 10;
        b[1] = 20;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }




}
