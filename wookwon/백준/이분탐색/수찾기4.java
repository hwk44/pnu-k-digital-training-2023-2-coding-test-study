package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기4 {

    //이진 탐색으로 풀기
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    public  static int binarySearch(int[]arr, int num){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == num){
                return mid;
            } else if (arr[mid] > num) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return  -1;
    }
}
