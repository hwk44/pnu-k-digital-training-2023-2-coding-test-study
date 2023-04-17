package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대표값2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double sum=0;
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (int) (sum / arr.length);
        int median = arr[arr.length /2];


        System.out.println(avg);
        System.out.println(median);
    }
}
