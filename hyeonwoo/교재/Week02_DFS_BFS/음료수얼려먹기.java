package 교재.Week02_DFS_BFS;

import java.util.Scanner;

public class 음료수얼려먹기 {

    // hint : dfs 로 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();

        int[][] ice = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ice[i][j] = sc.nextInt();
            }
        }


    }
}
