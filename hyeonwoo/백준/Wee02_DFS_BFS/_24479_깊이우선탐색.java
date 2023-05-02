package 백준.Wee02_DFS_BFS;


import java.io.*;
import java.util.*;

public class _24479_깊이우선탐색 {
    static boolean[] vis;
    static List<List<Integer>> graph;
    static int[] answer;
    static  int order = 1;
    public static void dfs(int s) {

        vis[s] = true;
        answer[s] = order++;

        for (int i = 0; i < graph.get(s).size(); i++) {
            int n = graph.get(s).get(i);
            if (!vis[n]) dfs(n);
        }
    }
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

        vis = new boolean[n+1];
        int[] visited = new int[n+1]; // 정점 방문확인
//        int[][] gragh = new int[n][n]; // 간선 정보 2차원 배열

//        List<List<Integer>>
        graph = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 리스트 별로 내림차순 정렬
        for (List list : graph) {
            Collections.sort(list, Collections.reverseOrder());
        }
        answer = new int[n+1];

        dfs(start);

        Stack<Integer> stack = new Stack<>();
        stack.add(start);


        StringBuilder sb = new StringBuilder();
        int cnt =0;


//        while (!stack.isEmpty()) {
//            int a = stack.pop();
//            // 방문처리
//            visited[a] = 1;
//            answer[a] = ++cnt;
//            for (int e : graph.get(a)) {
//                if (visited[e] == 0 && !stack.contains(e) ) stack.add(e);
//            }
//        }
//
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < n+1; i++) {
//            System.out.println(answer[i]);
            bw.write(answer[i] + "\n");
        }
        bw.close();

//        System.out.println(sb);
        



    }


}
