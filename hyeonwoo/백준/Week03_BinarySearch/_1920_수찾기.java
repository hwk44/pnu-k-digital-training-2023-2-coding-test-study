package 백준.Week03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_수찾기 {
    public static int binSearch(int[] nums, int target){
        int start = 0 ;
        int end = nums.length-1;
        int middle = (start+end)/2;

        while (start<= end){
            if (nums[middle] == target) return 1;
            if(nums[middle] < target) {
                start = middle +1;
                middle = (start+end)/2;
            }else {
                end = middle -1;
                middle = (start+end)/2;
            }

        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int [] targets = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < targets.length; i++) {
            targets[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        for (int i = 0; i < targets.length; i++) {
            System.out.println(binSearch(a,targets[i]));
        }
    }
}
