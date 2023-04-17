package 교재.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 부품찾기 { //이거 잘못함. 정렬을 먼저 시켜야 함.

    public static int binarySearch(int[] arr1, int[] target, int n, int m) {
        int start = 0;
        int end = n - 1;
        String[] answer = new String[target.length];

        while (true) {
            for (int i = 0; i < target.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    int mid = (start + end) / 2; // mid는 인덱스 역할을 함
                    if (target[i] == arr1[mid]) {
                        answer[i] = "yes";
                        start = 0;
                        end = n - 1;
                        break;
                    } else if (target[i] < arr1[mid]) {
                        end = mid;
                    } else if (target[i] > arr1[mid]) {
                        start = mid + 1;
                    }
                }
                if (i == target.length - 1) break;
            }
            break;
        }
        for (int i = 0; i < answer.length; i++) {
            if(answer[i]==null){
                answer[i] = "no";
            }
        }
        System.out.println(Arrays.toString(answer));
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        binarySearch(arr1, arr2, n, m);
    }
}
