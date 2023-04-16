package 백준.Week01_그리디알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

//        int [] a = {1, 2, 3};
//        int[] b = a;
//
//        a[0] = 10;
//        b[1] = 20;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);


        list.remove((Object)2);
        list.remove((Object)2);
        list.remove((Object)1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }




}
