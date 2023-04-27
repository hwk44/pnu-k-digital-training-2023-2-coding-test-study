package 백준.Wee02_DFS_BFS;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class _24479_깊이우선탐색 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점 갯수
        int m = sc.nextInt(); // 간선 갯수
        int start = sc.nextInt();


        int[] visited = new int[n+1]; // 정점 방문확인
        int[][] gragh = new int[n][n]; // 간선 정보 2차원 배열

        for (int i = 0; i <n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            gragh[a-1][b-1] = gragh[b-1][a-1] = 1;
        }


//        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        q.offer(start);
        visited[start] = 1;

        int[] answer = new int[n+1];
        int cnt =0;


        while (!q.isEmpty()) {
            int a = q.poll(); // 정점을 큐에서 빼냄
            System.out.println("빼낸 숫자 : " + a);
            answer[a] = ++cnt;
            for (int i = 0; i < n ; i++) {
            // 큐에서 제거한 숫자저장
                if (gragh[a-1][i] == 1 && visited[i+1] == 0){
                    // 큐에서 빼낸 숫자랑 간선 연결 되어있고 방문하지 않았으면
                    // 정점을 큐에 담고 방문처리
                    visited[i+1] = 1;
                    q.offer(i+1);

                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < n+1; i++) {
//            System.out.println(answer[i]);
            bw.write(answer[i] + "\n");
        }
        bw.close();

        



    }


}
