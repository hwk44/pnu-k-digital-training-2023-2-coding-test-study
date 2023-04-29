package 백준.Wee02_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1260_DFS와BFS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점 갯수
        int m = Integer.parseInt(st.nextToken()); // 간선 갯수
        int v = Integer.parseInt(st.nextToken()); // 탐색 시작 노드

        int[] visited = new int[n + 1]; // 0 번째 더미
        int[] visited2 = new int[n + 1]; // 0 번째 더미
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (List l : graph) {
            Collections.sort(l, Collections.reverseOrder());
            System.out.println(l);
        }
            PriorityQueue<Integer> pq = new PriorityQueue(); // bfs
            Stack<Integer> sta = new Stack<>();

            sta.push(v);
            pq.add(v);


//        System.out.println(graph.get(0).size());

//        List<Integer> answer_dfs = new ArrayList<>();
//        List<Integer> answer_bfs = new ArrayList<>();

        StringBuilder sb_bfs = new StringBuilder();
        StringBuilder sb_dfs = new StringBuilder();
        while (!pq.isEmpty()) {
            int a = pq.poll();
            sb_bfs.append(a + " ");
//            System.out.println("빼낸 숫자" + a);


            if(visited[a] == 1) continue;
            visited[a] = 1;
            if (graph.get(a).size() == 0) break; // 다음 방문할 노드가 없으면 탈출
            else {
                for (int c : graph.get(a)) { // 빼낸 숫자 인덱스의 리스트
                    if (visited[c] == 0 && !pq.contains(c)) { // 방문한적 없고 큐에 없으면 추가
                        pq.add(c);
                    }

                }
            }


        }
        while (!sta.isEmpty()) {
            int b = sta.pop();
            sb_dfs.append(b + " "); // 스텍에서 빼낸숫자

            visited2[b] = 1;
            for (int x: graph.get(b)) {
                if (!sta.contains(x) && visited2[x] == 0) // 스텍에 숫자가 없고 방문도 안했을때
                sta.add(x);
            }

        }
        System.out.println(sb_dfs);
        System.out.println(sb_bfs);

//        for

//        for (Object t : pq) {
//            System.out.println(t);
//        }


    }
}
