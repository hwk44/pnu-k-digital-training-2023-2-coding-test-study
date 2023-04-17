package 백준.Week03_BinarySearch;

import java.io.*;
import java.util.*;

public class _10816_숫자카드2 {
    public static int binSearch(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size() - 1;


        while (start <= end) {
            int middle = (start + end) / 2;

            // 배열에 숫자가 있으면 1 반환
            if (nums.get(middle) == target) return 1;
            if (nums.get(middle) < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bt = new BufferedWriter(new OutputStreamWriter(System.out));

        // 가지고 있는 숫자 카드

        int n = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }


        // 비교해야할 숫자카드

        int m = Integer.parseInt(br.readLine());
        List<Integer> targets = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            targets.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);

        for (int i = 0; i < targets.size(); i++) {
            int cnt = 0;
            if (binSearch(nums, targets.get(i)) == 1) { // 있으면?
                while (nums.contains(targets.get(i))) {
                    cnt += 1; // 카운트 증가
                    nums.remove((Object) targets.get(i)); // List 에서 제거
                }
            }
            bt.write(cnt + " ");
        }
        bt.close();
    }
}

