package 백준.Wee02_DFS_BFS;

import java.io.*;
import java.util.*;

public class _24479_깊이우선탐색 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//        int n = sc.nextInt(); // 정점 갯수
        int n = Integer.parseInt(st.nextToken()); // 정점 갯수
//        int m = sc.nextInt(); // 간선 갯수
        int m = Integer.parseInt(st.nextToken()); // 간선 갯수
//        int start = sc.nextInt();
        int start = Integer.parseInt(st.nextToken());


        int[] visited = new int[n+1]; // 정점 방문확인
//        int[][] gragh = new int[n][n]; // 간선 정보 2차원 배열

        List<List<Integer>> gragh = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            gragh.add(new ArrayList<>());
        }
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            int a = sc.nextInt();
//            int b = sc.nextInt();

            gragh.get(a).add(b);
            gragh.get(b).add(a);
//            gragh[a-1][b-1] = gragh[b-1][a-1] = 1;
        }

//        for (int i = 0; i < n+1; i++) {
//
//            System.out.println(gragh.get(i));
//        }


//        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        q.offer(start);


        int[] answer = new int[n+1];
        StringBuilder sb = new StringBuilder();
        int cnt =0;


        while (!q.isEmpty()) {
            // 큐에서 제거한 숫자저장
            int a = q.poll(); // 정점을 큐에서 빼냄
            // 방문처리
            visited[a] = 1;
//            System.out.println("빼낸 숫자 : " + a);
            if (a >= start ) answer[a] = ++cnt;
//            sb.append(a + " ");
//            answer[a] = ++cnt;

            for (int e : gragh.get(a)) {
                // 정점을 큐에 담고 방문처리
//                visited[i+1] = 1;
                if (visited[e] ==0 && !q.contains(e) && e >= start) q.offer(e);
            }


        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < n+1; i++) {
//            System.out.println(answer[i]);
            bw.write(answer[i] + "\n");
        }
        bw.close();

//        System.out.println(sb);
        



    }


}
