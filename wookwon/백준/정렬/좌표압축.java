package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n]; // 원본 배열
        int[] sorted = new int[n]; // 정렬할 배열
        Map<Integer, Integer> map = new HashMap<>(); //rank를 매길 map

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        int rank = 0;
        for(int v : sorted){
            //순위가 중복되지 않을 때만
            //map에 원소와 순위 삽입
            if(!map.containsKey(v)){
                map.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            int ranking = map.get(key); //key에 해당하는 value 저장
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
