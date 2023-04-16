package 백준.Week03_BinarySearch;

import java.io.*;
import java.util.*;

public class _10816_숫자카드2 {
    public static int binSearch(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size() - 1;
        int middle = (start + end) / 2;

        while (start <= end) {
            // 배열에 숫자가 있으면 1 반환
            if (nums.get(middle) == target) return 1;
            if (nums.get(middle) < target) {
                start = middle + 1;
                middle = (start + end) / 2;
            } else {
                end = middle - 1;
                middle = (start + end) / 2;
            }

        }
        return 0; // 배열에 숫자 없으면 0 반환
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
//        System.out.println(Collections.binarySearch(nums, 10));


//         Collections.binarySearch
//        for (int i = 0; i < targets.size(); i++) {
//            System.out.println(Collections.binarySearch(nums, targets.get(i)));
//        }
        for (int i = 0; i < targets.size(); i++) {
            int cnt = 0;
//            while (binSearch(nums, targets.get(i)) == 1) { // 있으면?
//                cnt += 1; // 카운트 증가
//                nums.remove(targets.get(i)); // List 에서 제거
//            }
//            int target = targets.get(i);
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
