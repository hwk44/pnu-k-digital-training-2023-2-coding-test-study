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

        int[] a = {1,2,3,4,5,6,8,14,18,23};
        System.out.println(Arrays.binarySearch(a,9)); // -8 // 7 부터 '9'보다 큰 수
        System.out.println(Arrays.binarySearch(a,1)); // -8 // 7 부터 '9'보다 큰 수

    }




}
