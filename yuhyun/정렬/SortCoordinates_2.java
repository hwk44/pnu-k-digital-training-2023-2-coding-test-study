package BaekJoon.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortCoordinates_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            p[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(p, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getY() == o2.getY())
                    return o1.getX() - o2.getX();
                return o1.getY() - o2.getY();
            }
        });

        for (int i = 0; i < p.length; i++) {
            sb.append(p[i].toString()).append("\n");
        }

        System.out.println(sb);
    }
}