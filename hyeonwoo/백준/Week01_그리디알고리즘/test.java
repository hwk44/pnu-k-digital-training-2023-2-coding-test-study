package 백준.Week01_그리디알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static int upperbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;
            // 배열에 숫자가 있으면 1 반환
            if ( nums.get(middle) <= target) { // 오른쪽부분
                start = middle + 1 ; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

    public static int lowerbound(List<Integer> nums, int target) {
        // 이진탐색
        int start = 0;
        int end = nums.size();

        while (start < end) {
            int middle = (start + end) / 2;
            // 배열에 숫자가 있으면 1 반환
            if (nums.get(middle) < target) { // 왼쪽부분
                start = middle + 1; // 찾아도 다음값으로
            } else {
                end = middle;
            }
        }
        return end;
    }

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
////        }
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(2);
//        list.add(2);
//
//
//        list.remove((Object)2);
//        list.remove((Object)2);
//        list.remove((Object)1);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }

//        int[] nums = {4, 26, 40, 42, 42, 42, 42 ,46};
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(26);
        nums.add(40);
        nums.add(42);
        nums.add(42);
        nums.add(42);
        nums.add(42);
        nums.add(46);
//        System.out.println(Arrays.binarySearch(nums, 23)); // -2
//        System.out.println(Arrays.binarySearch(nums, 27)); // -3
//        System.out.println(Arrays.binarySearch(nums, 3)); // -3
//        System.out.println(Arrays.binarySearch(nums, 42)); // -3
//        System.out.println(Arrays.binarySearch(nums, 42)); // -3

        System.out.println(upperbound(nums,42));
        System.out.println(lowerbound(nums,42));

    }




}
