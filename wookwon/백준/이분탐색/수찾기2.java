package 백준.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//HashSet 이용해서 품. 근데 굳이 쓴 이유? contains 메소드 쓸려고?
public class 수찾기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> nums = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        
        int q = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < q; i++) {
            int query = Integer.parseInt(st.nextToken());
            if (nums.contains(query)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}