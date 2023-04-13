package 교재.Week03_Binary_Search;

import java.util.Arrays;

public class Binary_Search {

    public static void main(String[] args) {

        int [] a = {1, 5, 6,7 ,1,7,8,9,25,29, 14, 19};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }
        System.out.println();
        System.out.println(binsearch(a,0));
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
