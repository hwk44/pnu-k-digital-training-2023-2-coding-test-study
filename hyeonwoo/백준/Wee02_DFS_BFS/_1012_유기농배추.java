package 백준.Wee02_DFS_BFS;

import java.util.Scanner;

public class _1012_유기농배추 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] map = new int[n][m];
            int k = sc.nextInt();

            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = 1;
            }

        }
    }
}
