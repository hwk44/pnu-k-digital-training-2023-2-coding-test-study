package 교재.Week02_DFS_BFS;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class dfs_bfs {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();
        while(!q.isEmpty()){
            System.out.print(q.poll()+ " ");
        }
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(5);
        q1.add(2);
        q1.add(3);
        q1.add(7);
        q1.poll();
        q1.add(1);
        q1.add(4);
        q1.poll();
        System.out.println();
        while(!q1.isEmpty()){
            System.out.print(q1.poll()+ " ");
        }
    }
}
