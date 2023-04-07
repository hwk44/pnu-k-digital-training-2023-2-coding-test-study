package 교재.Week01_그리디알고리즘;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(sc.next());
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 길이가 같으면 맨 앞 글자만 확인
                    return o1.compareTo(o2); // 앞 자리 같으면 사전 순으로
                }
                return o2.length() - o1.length();
            }
        });

        Map<Character, Integer> map = new HashMap<>();

        int idx = strings.get(0).length(); // 제일 자릿수가 큰 문자열의 자릿수 ex. 5 자리면 5

        int val = 9;
        int result =0;
        while (idx >= 1){
            for (int i = 0; i < strings.size(); i++) {
                if(idx > strings.get(i).length()) continue;
                if(!map.containsKey(strings.get(i).charAt(strings.get(i).length()-idx))) {
                    map.put(strings.get(i).charAt(strings.get(i).length()-idx), val-- );
                }
                result += map.get(strings.get(i).charAt(strings.get(i).length()-idx)) * Math.pow(10,idx-1);
            }
            idx--;

        }
        System.out.println(result);


    }

}
