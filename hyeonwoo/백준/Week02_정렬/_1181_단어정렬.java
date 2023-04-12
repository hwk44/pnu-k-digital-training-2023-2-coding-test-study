package 백준.Week02_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1181_단어정렬 {
    /*알파벳 소문자로 이루어진 N개의 단어가 들어오면
    아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

    길이가 짧은 것부터
    길이가 같으면 사전 순으로
    단, 중복된 단어는 하나만 남기고 제거해야 한다.*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
//            list.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (String s : list) {
            System.out.println(s);
        }

//        set.add("a");
//        set.add("a");
//        System.out.println(set);




    }
}
