package 백준.Wee02_DFS_BFS;
import java.util.*;
public class _2606_바이러스 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 총 컴퓨터 개수
        int m = sc.nextInt(); // 컴퓨터 연결 쌍 수

        boolean[] visited = new boolean[n+1];

//       List<int[]> list = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < m; i++) {
//            int[] temp = new int[2];
//            temp[0] = sc.nextInt();
//            temp[1] = sc.nextInt();
            List temp = new ArrayList();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            list.add(temp);
//            list.get(i).add(sc.nextInt());
//            list.get(i).add(sc.nextInt());
            Collections.sort(list.get(i));
//            Arrays.sort(temp);
//            list.add(temp);
        }

//        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i)[0] + " , " + list.get(i)[1]);
//            System.out.println(list.get(i).get(0)+" , " +list.get(i).get(1));
//
//        }
        // 정렬된 배열이 list 안에 있음

        int result = 0;
        // 큐 생성 bfs
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        // 큐에 들어갔었으면 방문처리
        visited[1] = true; //

        while (!q.isEmpty()){
            int temp = q.poll(); // 큐에서 빼냄
//            System.out.println("q 에서 빼낸 숫자 : " + temp);
//            for (int i = 0; i < visited.length; i++) {
//                System.out.println(visited[i]);
//            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).contains(temp)){ // 검사할 애가 있으면
                    for (int j = 0; j < list.get(i).size(); j++) {
                        if(!visited[list.get(i).get(j)]) {
                            // 방문 안했으면
                            q.offer(list.get(i).get(j)); //
//                            System.out.println("q 에 넣은 숫자 : "+ list.get(i).get(j));

                            result++;
                            visited[list.get(i).get(j)] = true;
                        }
                    }

                }

            }
        }
//        while (!q.isEmpty()){
//            int temp = q.poll(); // 큐에서 빼냄
//            System.out.println("q 에서 빼낸 숫자 : " + temp);
////            for (int i = 0; i < visited.length; i++) {
////                System.out.println(visited[i]);
////            }
//
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i). temp){
//
//                    // 방문 했으면 무시
//                    if(visited[list.get(i)[1]]) continue;
//
//                    q.offer(list.get(i)[1]);
//                    visited[list.get(i)[1]] = true; //
//                    System.out.println("큐에 들어간 숫자"+ list.get(i)[1]);
//                    result++;
//               }
//
//            }
//        }
        System.out.println(result);

    }


}
