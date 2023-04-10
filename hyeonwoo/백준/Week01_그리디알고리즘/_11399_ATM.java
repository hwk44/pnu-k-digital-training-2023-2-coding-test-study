package 백준.Week01_그리디알고리즘;


import java.util.*;

public class _11399_ATM {
    /*인하은행에는 ATM이 1대밖에 없다. 지금 이 ATM앞에 N명의
    사람들이 줄을 서있다. 사람은 1번부터 N번까지 번호가 매겨져 있으며
     i번 사람이 돈을 인출하는데 걸리는 시간은 Pi분이다.

사람들이 줄을 서는 순서에 따라서, 돈을 인출하는데 필요한 시간의 합이 달라지게 된다
예를 들어, 총 5명이 있고, P1 = 3, P2 = 1, P3 = 4, P4 = 3, P5 = 2 인 경우를
생각해보자. [1, 2, 3, 4, 5] 순서로 줄을 선다면,
1번 사람은 3분만에 돈을 뽑을 수 있다.
 2번 사람은 1번 사람이 돈을 뽑을 때 까지 기다려야 하기 때문에,
 3+1 = 4분이 걸리게 된다. 3번 사람은 1번, 2번 사람이 돈을 뽑을 때까지
  기다려야 하기 때문에, 총 3+1+4 = 8분이 필요하게 된다.
  4번 사람은 3+1+4+3 = 11분, 5번 사람은 3+1+4+3+2 = 13분이 걸리게 된다.
   이 경우에 각 사람이 돈을 인출하는데 필요한 시간의 합은 3+4+8+11+13 = 39분이 된다.

줄을 [2, 5, 1, 4, 3] 순서로 줄을 서면, 2번 사람은 1분만에,
5번 사람은 1+2 = 3분, 1번 사람은 1+2+3 = 6분, 4번 사람은 1+2+3+3 = 9분,
 3번 사람은 1+2+3+3+4 = 13분이 걸리게 된다.
 각 사람이 돈을 인출하는데 필요한 시간의 합은 1+3+6+9+13 = 32분이다.
  이 방법보다 더 필요한 시간의 합을 최소로 만들 수는 없다.
  */

    public static void main(String[] args) {
//        int[] a
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            map.put(i+1, p[i]);
        }
        // (value) p = 3, 1, 4, 3, 5
        // (key)       1  2  3  4  5

        // map 의 entrySet을 담은 List
        List<Map.Entry<Integer, Integer>> entry_list = new ArrayList<>(map.entrySet());
        Collections.sort(entry_list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        int[] s = new int[n];
        Integer sum = 0;
        int result = 0;
        for (int i = 0; i < entry_list.size(); i++) {
            sum += entry_list.get(i).getValue();
            s[i] = sum;
            result += s[i];
        }

        System.out.println(result);
//        int result = 0;
//        for (int i = 0; i < s.length; i++) {
//            result += s[i];
//        }


    }
}
