package 교재.Week01_그리디알고리즘;

import java.util.*;

public class test {

    public static void main(String[] args) {
//        String s= "abc";
//
//        Map<Character,Integer> map = new HashMap<>();
//
//        map.put(s.charAt(0),1);
//        System.out.println(map.get(s.charAt(1)));

        List<Integer> lst = new ArrayList<>();
        lst.add(4);
        lst.add(8);
        lst.add(0);
        lst.add(9);
        lst.add(9);

        // list 오름차순 정렬
        Collections.sort(lst);
        
        // 리스트를 셋으로 (중복 9 가 제거됨)
        Set<Integer> set1 = new HashSet<>(lst);
        for (int i : set1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-".repeat(30));
//        Collections.sort(set1); // Set 은 Collections.sort 안됨
        
        // 셋을 다시 리스트로
        List<Integer> list = new ArrayList<>(set1);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
