package 교재.정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 예제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //배열 a의 모든 원소 입력 받기
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //배열 b의 모든 원소 입력 받기
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        //배열 a는 오름차순 정렬
        Arrays.sort(a);
        //배열 b는 내림차순 정렬
        Arrays.sort(b, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 k번 비교
        for (int i = 0; i < k; i++) {
            //a의 원소가 b의 원소보다 작은 경우
            if (a[i] < b[i]) {
                //두 원소 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            //a의 원소가 b의 원소보다 크거나 같을 때, 탈출
            else break;
        }

        //출력
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);
    }
}
