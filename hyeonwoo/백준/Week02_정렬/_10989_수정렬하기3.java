package 백준.Week02_정렬;

import java.io.*;
import java.util.*;

public class _10989_수정렬하기3 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bt = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(br.readLine());
//        int n = sc.nextInt();
        int[] nums = new int[n];

//        List nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
//            nums.add(Integer.parseInt(br.readLine()));
        }

        int[] val = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            val[nums[i]]  += 1;
        }

        for (int i = 0; i < val.length; i++) {
            if (val[i] == 0) continue;
           int temp = val[i];
            for (int j = 0; j < temp; j++) {
                bt.write(i+ "\n");
            }
        }
        bt.close();
//        Arrays.sort(nums);
//        Collections.sort(nums);
//        for (int i : nums) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }

    }
}
