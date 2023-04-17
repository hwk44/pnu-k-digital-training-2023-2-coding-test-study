package BaekJoon.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RepresentativeValue_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);
        int avg = 0;
        int median = 0;
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += numbers[i];
        }
        avg = total/5;
        median = numbers[2];
        System.out.println(avg + "\n" + median);
    }
}
