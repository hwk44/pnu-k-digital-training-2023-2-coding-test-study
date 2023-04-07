package 교재.Week01_그리디알고리즘;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        String s= "abc";

        Map<Character,Integer> map = new HashMap<>();

        map.put(s.charAt(0),1);

        System.out.println(map.get(s.charAt(1)));
    }
}
