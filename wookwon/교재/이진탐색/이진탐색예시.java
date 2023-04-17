package 교재.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 이진탐색예시 {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] > target) {
                end = mid - 1;
            }else if(arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        //전달할 배열
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("찾은 값 없음");
        }else {
            System.out.println(result+1);
        }

    }
}
