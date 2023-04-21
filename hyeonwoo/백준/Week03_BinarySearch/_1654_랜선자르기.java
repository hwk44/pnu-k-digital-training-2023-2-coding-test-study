package 백준.Week03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1654_랜선자르기 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 원하는 갯수

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            nums[i] = temp;
        }
        Arrays.sort(nums);

        int s = 0;
        int e = nums[nums.length - 1];

        while (s<= e) {
            int sum = 0; // 자른 갯수 확인하는 정수
            int mid = (s+e) /2;
            if(mid > nums[0]) mid = nums[0];

            int temp = nums[nums.length-1] / mid; // 마지막 값은 얼마나 나눌수 있는가?

            int[] t = new int[temp];
            for (int i = 0; i < temp; i++) { //

                int bs_val = Arrays.binarySearch(nums, i*mid);
                if(bs_val == -1) bs_val =0;
                else if (bs_val < 0) bs_val = bs_val*(-1) -1;
                t[i] = Arrays.binarySearch(nums, i*mid);
            }
            // TODO mid의 배수들(또는 그보다 큰 값)이 위치하는 인덱스 값을 찾은 배열 t
            // 각 인덱스 순회 하면서 어떻게 자르고 값을 더할지?


            for (int i : nums) {

                sum += i / mid;
            }
            if (sum == m) {
                System.out.println(mid);
                break;
            }
            else if (sum < m) { // 랜선 부족하면
                e = mid -1;
            } else { // 원하는 값보다 크거나 같으면? 뒤쪽 확인
                s = mid + 1;
            }


        }

    }
}
