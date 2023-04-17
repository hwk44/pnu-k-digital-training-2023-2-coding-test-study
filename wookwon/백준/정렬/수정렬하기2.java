package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // StringBuilder 클래스는 String 클래스보다 효율적으로 문자열 생성 및 조작 가능
                                                // 장점은 변경(수정) 가능하다는 것
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list); //TimSort
        for (int a:
             list) {
            sb.append(a).append("\n"); // append() -> 문자열 끝에 문자열끝에 문자열,문자 등등 붙일 수 있다.
        }
        System.out.println(sb);
    }
}
