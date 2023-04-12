package 백준.Week02_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public  class _11650_좌표정렬하기 {

    static class Point {
        int x;
        int y;

        public Point() {
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return  x + " " + y ;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        StringTokenizer st ;//  new StringTokenizer(br.readLine());

        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point p = new Point();
            st = new StringTokenizer(br.readLine());
            p.setX(Integer.parseInt(st.nextToken()));
            p.setY(Integer.parseInt(st.nextToken()));
//            p.setX(sc.nextInt());
//            p.setY(sc.nextInt());
            list.add(p);
        }


        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getX() == o2.getX()){
                    return o1.getY()- o2.getY();
                }
                return o1.getX() - o2.getX();
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
