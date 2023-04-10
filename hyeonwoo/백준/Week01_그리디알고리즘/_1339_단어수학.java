package 백준.Week01_그리디알고리즘;

import java.util.*;

    /*민식이는 수학학원에서 단어 수학 문제를 푸는 숙제를 받았다.

    단어 수학 문제는 N개의 단어로 이루어져 있으며,
   각 단어는 알파벳 대문자로만 이루어져 있다.
   이때, 각 알파벳 대문자를 0부터 9까지의 숫자 중 하나로
   바꿔서 N개의 수를 합하는 문제이다. 같은 알파벳은 같은 숫자로 바꿔야 하며,
   두 개 이상의 알파벳이 같은 숫자로 바뀌어지면 안 된다.

    예를 들어, GCF + ACDEB를 계산한다고 할 때,
    A = 9, B = 4, C = 8, D = 6, E = 5, F = 3, G = 7로 결정한다면,
     두 수의 합은 99437이 되어서 최대가 될 것이다.

    N개의 단어가 주어졌을 때,
    그 수의 합을 최대로 만드는 프로그램을 작성하시오.*/
public class _1339_단어수학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strings = new ArrayList<>();

//        String[] strings = new String[n];

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


//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }

        Map<Character, Integer> map = new HashMap<>();

        int idx = strings.get(0).length(); // 제일 자릿수가 큰 문자열의 자릿수 ex. 5 자리면 5


        int a = 99999999*10;

        int val = 9;
        int result =0;
        while (idx >= 1){
            for (int i = 0; i < strings.size(); i++) {


                if(idx > strings.get(i).length()) continue;
                if(!map.containsKey(strings.get(i).charAt(strings.get(i).length()-idx))) {
                            map.put(strings.get(i).charAt(strings.get(i).length()-idx), val-- );
                }
//                result += Math.pow(map.get(strings.get(i).charAt(strings.get(i).length() - idx)),idx);
                result += map.get(strings.get(i).charAt(strings.get(i).length()-idx)) * Math.pow(10,idx-1);
//                if(idx == 0 && i == 0) break;

//                if(idx > strings.get(i).length()) continue;
//                if(!map.containsKey(strings.get(i).charAt(strings.get(i).length()-idx))) {
//                    map.put(strings.get(i).charAt(strings.get(i).length()-idx), val-- );
//                }
//                result += map.get(strings.get(i).charAt(strings.get(i).length()-idx)) * Math.pow(10,idx-1);
            }
            idx--;

        }
        System.out.println(result);

//        int val = 9;
//        for (int i = 0; i < strings.size(); i++) {
////            if (strings.get(i+1))
//            for (int j = 0; j < strings.get(i).length(); j++) { // 각 단어 Character 순회
//
//                if(!map.containsKey(strings.get(i).charAt(j))) { // 맵에 없으면 넣기
//                    map.put(strings.get(i).charAt(j), val--);
//                }
//
//            }
//        }
       for( Map.Entry<Character, Integer> entry : map.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
//        for (String s: strings) {
//            System.out.println(s);
//        }

    }

}
