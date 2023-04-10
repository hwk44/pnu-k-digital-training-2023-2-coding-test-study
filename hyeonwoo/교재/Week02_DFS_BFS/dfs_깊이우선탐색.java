package 교재.Week02_DFS_BFS;

import java.util.ArrayList;
import java.util.List;

public class dfs_깊이우선탐색 {
    // DFS 함수 정의
    // 1-8 노드의 방문 처리할 부울 배열
    public static boolean[] visited = new boolean[9];
    // 각 노드와 연결된 노드 번호가 배열 형식으로 들어감
    public static List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void dfs(int x) {
        // 현재 노드 방문 처리
        visited[x] = true;
        System.out.print(x + " ");

        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) {
                dfs(1);
    }
}
