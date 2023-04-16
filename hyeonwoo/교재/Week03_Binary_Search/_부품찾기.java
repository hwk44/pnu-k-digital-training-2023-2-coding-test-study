package 교재.Week03_Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _부품찾기 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        int[] nums = new int[n]; // 가게에 있는 부품 번호

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] coustom = new int[m]; // 손님이 요청한 부품들 번호

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < coustom.length; i++) {
            coustom[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums); //
        for (int i = 0; i < coustom.length; i++) {
            if(binsearch(nums,coustom[i]) !=  -1) { // 값이 있으면
                System.out.print("yes");
            }else {
                System.out.print("no");
            }
            System.out.print(" ");
        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        for (int i = 0; i < m; i++) {
//            System.out.println(coustom[i]);
//        }
    }
    public static int binsearch(int[] a , int target){
        int start = 0;
        int end = a.length-1;
        int middle = (start + end) /2 ;
        while (start <= end){
            if(a[middle] == target) return middle;

            if (a[middle] < target){ // 타깃이 뒤에 있으면 뒤만 확인
                start = middle + 1;
                middle = (start + end) /2;
            }
            if(target < a[middle]) { // 타깃이 앞에 있으면 앞에만 확인
                end = middle -1;
                middle = (start + end) /2;
            }
        }
        return -1; // 없으면 -1 반환
    }

}
