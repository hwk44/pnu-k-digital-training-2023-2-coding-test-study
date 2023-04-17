package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 좌표압축2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //원본배열
        int[] origin = new int[n];
        //정렬할 배열
        int[] sorted = new int[n];
        //해시맵
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //한 줄만 읽을 거니까 반복문 밖으로 뺌
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);
        int rank = 0;
        for(int k : sorted){
            if(!map.containsKey(k)){
                map.put(k, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();

        //원본 배열의 원소들을 맵의 키로 전달. 그러면 각 원본 배열 원소에 해당하는 순위가 append 됨
        for(int key : origin){
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);


    }
}
