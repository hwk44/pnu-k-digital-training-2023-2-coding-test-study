package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//시간초과
public class 수찾기 {

    public static void binarySearch(int[] arr1, int[] arr2, int[]arr3, int start, int end) {

        Map<Integer, Integer> map = new HashMap<>();
        while (true) {
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    int mid = (start + end) / 2;
                    if (arr2[i] == arr1[mid]) {
                        map.put(arr2[i], 1);
                        start = 0;
                        end = arr1.length - 1;
                        break;
                    } else if (arr2[i] < arr1[mid]) {
                        end = mid - 1;
                    } else if (arr2[i] > arr1[mid]) {
                        start = mid + 1;
                    }
                }
                if (i == arr2.length - 1) break;
            }
            break;
        }

        StringBuilder sb = new StringBuilder();
        for(int k : arr3){
            if(map.containsKey(k)){
                sb.append(map.get(k)).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
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

        int arr3[] = arr2.clone();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        binarySearch(arr1, arr2, arr3, 0, n - 1);

    }
}
